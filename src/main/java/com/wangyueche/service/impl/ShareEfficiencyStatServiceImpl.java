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
import com.wangyueche.bean.vo.share.ShareEfficiencyStat;
import com.wangyueche.bean.vo.share.ShareOperateStat;
import com.wangyueche.mapper.ShareEfficiencyStatMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareEfficiencyStatService;
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
public class ShareEfficiencyStatServiceImpl implements ShareEfficiencyStatService {
    @Autowired
    private ShareEfficiencyStatMapper mapper;

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

        List<ShareEfficiencyStat> list = mapper.listStat(companyId, start, end);
        if (list.size() < 1) {
            return StateCode.ERROR;
        }

        //将各个数据取出，放入数组中
        int arrayLength = list.size();
        String[] companyNames = new String[arrayLength];
        Double[] avgMile = new Double[arrayLength];
        Double[] avgTime = new Double[arrayLength];
        Double[] avgFareByOrder = new Double[arrayLength];
        Double[] avgFareByMile = new Double[arrayLength];

        Map<String, String> map = companyService.listCompanyNames();
        for (int i = 0; i < arrayLength; i++) {
            ShareEfficiencyStat stat = list.get(i);
            Long orderNum = stat.getOrderNum() == null ? 0 : stat.getOrderNum();
            BigDecimal driveMile = stat.getDriveMile() == null ? new BigDecimal(0) : stat.getDriveMile();
            Long driveTime = stat.getDriveTime() == null ? 0 : stat.getDriveTime();
            BigDecimal factPrice = stat.getFactPrice() == null ? new BigDecimal(0) : stat.getFactPrice();

            companyNames[i] = map.get(stat.getCompanyId());
            if (orderNum != 0) {
                avgMile[i] = Math.round((driveMile.doubleValue() / orderNum)*100)/100.0;
                avgTime[i] = Math.round((driveTime / (orderNum * 60.0)) * 100) / 100.0;
                avgFareByOrder[i] = Math.round((factPrice.doubleValue() / orderNum) * 100) / 100.0;
            } else {
                avgMile[i] = 0.00;
                avgTime[i] = 0.00;
                avgFareByOrder[i] = 0.00;
            }
            if (driveMile.doubleValue() != 0.00) {
                avgFareByMile[i] = Math.round((factPrice.doubleValue() / driveMile.doubleValue())*100)/100.0;
            } else {
                avgFareByMile[i] = 0.00;
            }

        }

        //设置统计数据名称
        String[] lengNames = {"平均里程","平均耗时","平均费用","平均每公里费用"};
        //柱状图颜色
        String[] colors = {"#42b7b5", "#3398DB", "#3379b4","#675bba"};

        Option option = new Option();
        option.tooltip().trigger(Trigger.axis).axisPointer();

        option.tooltip().formatter("{b}: <br/>{a0}: {c0}km<br/>{a1}: {c1}分钟<br/>{a2}: {c2}元<br/>{a3}: {c3}元");
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
        color.add(colors[3]);
        option.setColor(color);
        option.calculable(true);

        //设置x轴
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(companyNames);
        option.xAxis(categoryAxis);


        //左侧y轴
        ValueAxis orderNumValue = new ValueAxis();
        orderNumValue.setType(AxisType.value);
        //orderNumValue.setName("数量");
        orderNumValue.axisLabel().formatter("{value}");

        //右侧y轴
        ValueAxis matchRateValue = new ValueAxis();
        matchRateValue.setType(AxisType.value);
        matchRateValue.setName("费用");
        matchRateValue.setMin(0);
        matchRateValue.setMax(100);
        matchRateValue.axisLabel().formatter("{value} 元");
        matchRateValue.boundaryGap(false);
        matchRateValue.splitLine().show(false);
        option.yAxis(orderNumValue,matchRateValue);

        Bar totalBar = new Bar();
        totalBar.barMaxWidth(50);
        totalBar.name(lengNames[0]).data(avgMile);

        Bar matchBar = new Bar();
        matchBar.barMaxWidth(50);
        matchBar.name(lengNames[1]).data(avgTime);

        Bar rateBar = new Bar();
        rateBar.barMaxWidth(50);
        rateBar.name(lengNames[2]).data(avgFareByOrder).yAxisIndex(1);

        Bar fareBar = new Bar();
        fareBar.barMaxWidth(50);
        fareBar.name(lengNames[3]).data(avgFareByMile).yAxisIndex(1);

        option.series(totalBar,matchBar,rateBar,fareBar);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
