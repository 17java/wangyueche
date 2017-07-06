package com.wangyueche.service.impl;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Bar;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.statistics.DriverReputationStat;
import com.wangyueche.mapper.DriverReputationStatMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.statistics.DriverReputationStatService;
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
public class DriverReputationStatServiceImpl implements DriverReputationStatService {
    @Autowired
    private DriverReputationStatMapper mapper;

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

        List<DriverReputationStat> list = mapper.listStat(companyId, start, end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }

        Map<String, String> map = infoService.idWithName();
        for (DriverReputationStat stat : list) {
            stat.setCompanyName(map.get(stat.getCompanyId()));
        }

        //设置统计数据名称
        String[] lengNames = {"乘客投诉次数","处罚次数","违章次数","完成订单次数"};
        //柱状图颜色
        String[] colors = {"#42b7b5", "#3398DB", "#3379b4","#5075d6"};

        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Integer[] orderCount = new Integer[arrayLength];
        Integer[] punishCount = new Integer[arrayLength];
        Integer[] violation = new Integer[arrayLength];
        Integer[] complaint = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            DriverReputationStat stat = list.get(i);
            companyNames[i] = stat.getCompanyName();
            orderCount[i] = stat.getOrderAmount();
            punishCount[i] = stat.getPunishTimes();
            violation[i] = stat.getViolationTimes();
            complaint[i] = stat.getPassengerComplaintTimes();
        }


        Option option = new Option();
        option.legend(lengNames);

        option.tooltip().trigger(Trigger.axis).axisPointer();
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
        color.add(colors[3]);
        option.setColor(color);
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(companyNames);
        option.xAxis(categoryAxis);


        //左侧y轴
        ValueAxis timesValue = new ValueAxis();
        timesValue.setType(AxisType.value);
        timesValue.setName("次数");
        timesValue.axisLabel().formatter("{value} 次");

        //右侧订单y轴
        ValueAxis orderValue = new ValueAxis();
        orderValue.setType(AxisType.value);
        orderValue.setName("完成订单数");
        orderValue.axisLabel().formatter("{value} 单");
        orderValue.splitLine().show(false);


        option.yAxis(timesValue,orderValue);

        Bar complaintBar = new Bar();
        complaintBar.barMaxWidth(50);
        complaintBar.name(lengNames[0]).data(complaint);

        Bar punishBar = new Bar();
        punishBar.barMaxWidth(50);
        punishBar.name(lengNames[1]).data(punishCount);

        Bar violationBar = new Bar();
        violationBar.barMaxWidth(50);
        violationBar.name(lengNames[2]).data(violation);

        Bar orderLine = new Bar();
        orderLine.barMaxWidth(50);
        orderLine.name(lengNames[3]).data(orderCount).yAxisIndex(1);

        option.series(complaintBar,punishBar,violationBar,orderLine);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
