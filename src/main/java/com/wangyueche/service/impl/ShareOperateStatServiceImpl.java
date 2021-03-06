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
import com.wangyueche.bean.vo.share.ShareOperateStat;
import com.wangyueche.mapper.ShareOperateStatMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareOperateStatService;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class ShareOperateStatServiceImpl implements ShareOperateStatService {
    @Autowired
    private ShareOperateStatMapper mapper;

    @Autowired
    private ShareCompanyService companyService;

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

        List<ShareOperateStat> list = mapper.listStat(companyId, start, end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }

        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Integer[] vehicleNum = new Integer[arrayLength];
        Integer[] orderNum = new Integer[arrayLength];
        BigDecimal[] money = new BigDecimal[arrayLength];

        Map<String, String> map = companyService.listCompanyNames();
        for (int i = 0; i < arrayLength; i++) {
            ShareOperateStat stat = list.get(i);
            companyNames[i] = map.get(stat.getCompanyId());
            vehicleNum[i] = stat.getVehicleNum() == null ? 0 : stat.getVehicleNum() ;
            orderNum[i] = stat.getOrderNum() == null ? 0 : stat.getOrderNum();
            money[i] = stat.getMoney() == null ? new BigDecimal(0) : stat.getMoney();
        }

        //设置统计数据名称
        String[] lengNames = {"营运车辆数","成功订单数","订单总金额"};
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


        //左侧y轴
        ValueAxis orderNumValue = new ValueAxis();
        orderNumValue.setType(AxisType.value);
        orderNumValue.setName("数量");
        orderNumValue.axisLabel().formatter("{value} 辆（单）");

        //右侧y轴
        ValueAxis matchRateValue = new ValueAxis();
        matchRateValue.setType(AxisType.value);
        matchRateValue.setName("总金额");
        matchRateValue.setMin(0);
        matchRateValue.setMax(100);
        matchRateValue.axisLabel().formatter("{value} 元");
        matchRateValue.boundaryGap(false);
        matchRateValue.splitLine().show(false);
        option.yAxis(orderNumValue,matchRateValue);

        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(vehicleNum);

        Bar matchBar = new Bar();
        matchBar.barMaxWidth(50);
        matchBar.name(lengNames[1]).data(orderNum);

        Bar rateBar = new Bar();
        rateBar.barMaxWidth(50);
        rateBar.name(lengNames[2]).data(money).yAxisIndex(1);

        option.series(totalBar,matchBar,rateBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
