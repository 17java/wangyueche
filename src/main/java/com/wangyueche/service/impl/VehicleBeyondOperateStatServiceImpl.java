package com.wangyueche.service.impl;

import com.github.abel533.echarts.AxisPointer;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Bar;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.statistics.VehicleBeyondOperateStat;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.statistics.VehicleBeyondOperateStatService;
import com.wangyueche.mapper.VehicleBeyondOperateStatMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class VehicleBeyondOperateStatServiceImpl implements VehicleBeyondOperateStatService {
    @Autowired
    private VehicleBeyondOperateStatMapper mapper;
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
        List<VehicleBeyondOperateStat> list = mapper.listStat(companyId,start,end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }
        Map<String, String> map = infoService.idWithName();
        for (VehicleBeyondOperateStat vo : list) {
            vo.setCompanyName(map.get(vo.getCompanyId()));
            if (vo.getVehicleAmount() == null) {
                vo.setVehicleAmount(0);
            }
        }
        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Integer[] vehicleAmount = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            VehicleBeyondOperateStat vo = list.get(i);
            companyNames[i] = vo.getCompanyName();
            vehicleAmount[i] = vo.getVehicleAmount();
        }

        //设置统计数据名称
        String[] lengNames = {"车辆数"};
        //柱状图颜色
        String[] colors = {"#3398DB"};

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
        option.setColor(color);
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(companyNames);
        option.xAxis(categoryAxis);


        //左侧订单y轴
        ValueAxis orderNumValue = new ValueAxis();
        orderNumValue.setType(AxisType.value);
        orderNumValue.setName("车辆数");
        orderNumValue.axisLabel().formatter("{value} 辆");
        option.yAxis(orderNumValue);


        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(vehicleAmount);


        option.series(totalBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
