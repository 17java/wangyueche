package com.wangyueche.service.impl;

import com.github.abel533.echarts.AxisPointer;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Line;
import com.wangyueche.service.statistics.DriveTimeDistributionService;
import com.wangyueche.mybatis.DriveTimeDistributionMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojl on 2017/5/9 4:34.
 */
@Service
public class DriveTimeDistributionServiceImpl implements DriveTimeDistributionService {
    @Autowired
    private DriveTimeDistributionMapper mapper;

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


        Integer[] amount = new Integer[24];//柱状图数据
        String[] hours = new String[24];//x轴显示
        for (int i = 0; i < 24; i++) {
            amount[i] = mapper.listStat(companyId, start, end, i).getVehicleAmount();
            hours[i] = i+"h";
        }


        //设置统计数据名称
        String[] lengNames = {"用车数量"};
        //柱状图颜色
        List<Object> color = new ArrayList<>();
        color.add("#3398DB");

        Option option = new Option();
        option.tooltip().trigger(Trigger.axis).axisPointer();
        option.legend(lengNames);

        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar).show(true),
                Tool.restore,
                Tool.saveAsImage);
        option.setColor(color);
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(hours);
        option.xAxis(categoryAxis);


        //左侧y轴
        ValueAxis orderNumValue = new ValueAxis();
        orderNumValue.setType(AxisType.value);
        orderNumValue.setName("用车数量");
        orderNumValue.axisLabel().formatter("{value} 量");
        option.yAxis(orderNumValue);

        Line line = new Line();
        line.name(lengNames[0]).data(amount).smooth(true);

        option.series(line);

        String optionStr = GsonUtil.format(option);
        System.out.println(optionStr);
        return optionStr;
    }
}
