package com.wangyueche.service.impl;

import com.github.abel533.echarts.AxisPointer;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Line;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.statistics.VehicleOperateStat;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.statistics.VehicleOperateStatService;
import com.wangyueche.mybatis.VehicleOperateStatMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by gaojl on 2017/5/8 15:31 .
 */
@Service
public class VehicleOperateStatServiceImpl implements VehicleOperateStatService {
    @Autowired
    private VehicleOperateStatMapper mapper;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public String listStat(String companyId, String startDate, String endDate) {
        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
        }
        List<VehicleOperateStat> list = mapper.listStat(companyId, start, end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }
        Map<String, String> map = infoService.idWithName();
        for (VehicleOperateStat stat : list) {
            stat.setCompanyName(map.get(stat.getCompanyId()));
        }
        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        BigDecimal[] totalMile = new BigDecimal[arrayLength];//总里程
        BigDecimal[] totalDriveMile = new BigDecimal[arrayLength];//载客里程
        Long[] totalDriveTime = new Long[arrayLength];//载客时间,单位分钟
        for (int i = 0; i < arrayLength; i++) {
            VehicleOperateStat stat = list.get(i);
            companyNames[i] = stat.getCompanyName();
            totalDriveMile[i] = stat.getTotalDriveMile() == null ? new BigDecimal(0) : stat.getTotalDriveMile();
            totalMile[i] = stat.getTotalMile() == null ? new BigDecimal(0) : stat.getTotalMile();
            totalDriveTime[i] = stat.getTotalDriveTime() == null ? 0L : (stat.getTotalDriveTime() / 3600);
        }

        //设置统计数据名称
        String[] lengNames = {"总行驶里程（公里）", "总载客里程（公里）", "总载客时间（小时）"};
        //柱状图颜色
        String[] colors = {"#42b7b5", "#3398DB", "#3379b4"};
        Option option = new Option();
        option.tooltip().trigger(Trigger.axis).axisPointer();
        option.legend(lengNames);

        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar).show(true),
                Tool.restore,
                Tool.saveAsImage);
        List<Object> color = new ArrayList<>();
        color.add(colors[0]);
        color.add(colors[1]);
        color.add(colors[2]);
        option.setColor(color);
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(companyNames);
        option.xAxis(categoryAxis);


        //左侧订单y轴
        ValueAxis orderNumValue = new ValueAxis();
        orderNumValue.setType(AxisType.value);
        orderNumValue.setName("里程");
        orderNumValue.axisLabel().formatter("{value} 公里");

        //右侧成功率y轴
        ValueAxis matchRateValue = new ValueAxis();
        matchRateValue.setType(AxisType.value);
        matchRateValue.setName("时间");
        //matchRateValue.setMin(0);
        //matchRateValue.setMax(100);
        matchRateValue.axisLabel().formatter("{value} 小时");
        matchRateValue.boundaryGap(false);
        matchRateValue.splitLine().show(false);
        option.yAxis(orderNumValue,matchRateValue);

        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(totalMile);

        Bar matchBar = new Bar();
        matchBar.barMaxWidth(50);
        matchBar.name(lengNames[1]).data(totalDriveMile);

        Bar rateBar = new Bar();
        rateBar.barMaxWidth(50);
        rateBar.name(lengNames[2]).data(totalDriveTime).yAxisIndex(1);

        option.series(totalBar,matchBar,rateBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }

    @Override
    public String listIndexInfo() {
        Calendar calendar = Calendar.getInstance();

        //获取当前小时，用于echart类目轴
        Integer hour = calendar.get(Calendar.HOUR_OF_DAY);

        //获取当前时间long型数字，用于数据库查询
        Date date = calendar.getTime();
        String dateString = DateUtil.sdf.format(date);
        Long current = Long.parseLong(dateString);

        //获取当前年月日
        Long base = current / 1000000;

        //创建数据容器
        Map<String, String> map = infoService.idWithName();
        Map<String, Integer[]> dataMap = new HashMap<>();

        //创建公司名称集合
        List<String> companyNames = new ArrayList<>();

        //初始化数据容器
        for (String companyId : map.keySet()) {
            companyNames.add(map.get(companyId));
            dataMap.put(companyId, new Integer[hour + 1]);
        }

        String[] x = new String[hour + 1];

        //设置每个小时的数据
        for (int i = 0; i < hour + 1; i++) {
            x[i] = i + "";
            for (String companyId : dataMap.keySet()) {
                (dataMap.get(companyId))[i] = mapper.selectVehicleCount(companyId, ((base * 100) + i) * 10000, ((base * 100) + i + 1) * 10000 - 1);
            }
        }

        Option option = new Option();
        option.title("分时营运车辆数（辆）");

        option.tooltip().trigger(Trigger.axis).axisPointer();
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(x);
        categoryAxis.boundaryGap(false);
        option.xAxis(categoryAxis);


        //左侧y轴
        ValueAxis timesValue = new ValueAxis();
        timesValue.setType(AxisType.value);
        timesValue.axisLabel().formatter("{value} ");

        option.yAxis(timesValue);

        Line[] lines = new Line[dataMap.size()];
        int index = 0;
        for (String companyId:dataMap.keySet()) {
            lines[index] = new Line();
            lines[index].name(map.get(companyId)).smooth(true).data(dataMap.get(companyId));
            index++;
        }

        option.series(lines);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }


}
