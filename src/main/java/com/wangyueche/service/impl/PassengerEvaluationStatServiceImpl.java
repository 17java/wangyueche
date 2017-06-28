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
import com.wangyueche.bean.vo.statistics.PassengerEvaluationStat;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.statistics.PassengerEvaluationStatService;
import com.wangyueche.mybatis.PassengerEvaluationStatMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/9 5:01.
 */
@Service
public class PassengerEvaluationStatServiceImpl implements PassengerEvaluationStatService {
    @Autowired
    private PassengerEvaluationStatMapper mapper;
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
        List<PassengerEvaluationStat> list = mapper.listStat(companyId, start, end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }
        Map<String, String> map = infoService.idWithName();
        for (PassengerEvaluationStat vo : list) {
            vo.setCompanyName(map.get(vo.getCompanyId()));
            if (vo.getDriverScore() == null) {
                vo.setDriverScore(0.0);
            }
            if (vo.getVehicleScore() == null) {
                vo.setVehicleScore(0.0);
            }
            if (vo.getServiceScore() == null) {
                vo.setServiceScore(0.0);
            }
            vo.setDriverScore(Math.round(vo.getDriverScore() * 1000) / 1000.0);
            vo.setVehicleScore(Math.round(vo.getVehicleScore() * 1000) / 1000.0);
            vo.setServiceScore(Math.round(vo.getServiceScore() * 1000) / 1000.0);
        }
        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Double[] driverScore = new Double[arrayLength];
        Double[] vehicleScore = new Double[arrayLength];
        Double[] serviceScore = new Double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            PassengerEvaluationStat vo = list.get(i);
            companyNames[i] = vo.getCompanyName();
            driverScore[i] = vo.getDriverScore();
            vehicleScore[i] = vo.getVehicleScore();
            serviceScore[i] = vo.getServiceScore();
        }

        //设置统计数据名称
        String[] lengNames = {"驾驶员满意度", "车辆满意度", "服务满意度"};
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
        orderNumValue.setName("满意度");
        orderNumValue.axisLabel().formatter("{value} 分");
        option.yAxis(orderNumValue);


        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(driverScore);

        Bar matchBar = new Bar();
        matchBar.barMaxWidth(50);
        matchBar.name(lengNames[1]).data(vehicleScore);

        Bar rateBar = new Bar();
        rateBar.barMaxWidth(50);
        rateBar.name(lengNames[2]).data(serviceScore);

        option.series(totalBar, matchBar, rateBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
