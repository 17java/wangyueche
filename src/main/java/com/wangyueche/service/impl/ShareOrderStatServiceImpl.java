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
import com.wangyueche.bean.vo.statistics.OrderStatVo;
import com.wangyueche.mybatis.ShareOrderStatMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareOrderStatService;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/16 11:45 .
 */
@Service
public class ShareOrderStatServiceImpl implements ShareOrderStatService{
    @Autowired
    private ShareOrderStatMapper mapper;

    @Autowired
    private ShareCompanyService companyService;

    public String listStat(String companyId, String startDate, String endDate) {
        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
        }

        List<OrderStatVo> list = mapper.listOrderStat(companyId, start, end);
        Map<String, String> map = companyService.listCompanyNames();
        for (OrderStatVo vo : list) {
            vo.setCompanyName(map.get(vo.getCompanyId()));
            if (vo.getMatchOrder() != null) {
                Double rate = Math.ceil(vo.getMatchOrder() * 10000.0 / vo.getTotalOrder()) / 100;
                vo.setMatchRate(rate);
            } else {
                vo.setMatchOrder(0);
                vo.setMatchRate(0.00);
            }
        }
        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Integer[] totalNum = new Integer[arrayLength];
        Integer[] matchNum = new Integer[arrayLength];
        Double[] matchRate = new Double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            OrderStatVo orderStatVo = list.get(i);
            companyNames[i] = orderStatVo.getCompanyName();
            totalNum[i] = orderStatVo.getTotalOrder();
            matchNum[i] = orderStatVo.getMatchOrder();
            matchRate[i] = orderStatVo.getMatchRate();
        }

        //设置统计数据名称
        String[] lengNames = {"总订单", "成功订单","成功率"};
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
        orderNumValue.setName("订单量");
        orderNumValue.axisLabel().formatter("{value} 单");

        //右侧成功率y轴
        ValueAxis matchRateValue = new ValueAxis();
        matchRateValue.setType(AxisType.value);
        matchRateValue.setName("成功率");
        matchRateValue.setMin(0);
        matchRateValue.setMax(100);
        matchRateValue.axisLabel().formatter("{value} %");
        matchRateValue.boundaryGap(false);
        matchRateValue.splitLine().show(false);
        option.yAxis(orderNumValue,matchRateValue);

        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(totalNum);

        Bar matchBar = new Bar();
        matchBar.barMaxWidth(50);
        matchBar.name(lengNames[1]).data(matchNum);

        Bar rateBar = new Bar();
        rateBar.barMaxWidth(50);
        rateBar.name(lengNames[2]).data(matchRate).yAxisIndex(1);

        option.series(totalBar,matchBar,rateBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
