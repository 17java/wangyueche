package com.wangyueche.service.impl;

import com.github.abel533.echarts.Legend;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.itemstyle.Emphasis;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.mapper.VehicleOrderTakingMapper;
import com.wangyueche.service.statistics.VehicleOrderTakingSerivce;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq
 */
@Service
public class VehicleOrderTakingServiceImpl implements VehicleOrderTakingSerivce {
    @Autowired
    private VehicleOrderTakingMapper mapper;

    @Override
    public String listBarStat(String companyId, String startDate, String endDate,String type) {
        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
        }

        Integer[] orderAmount = new Integer[5];
        orderAmount[0] = mapper.listByOrderAmount(companyId, start, end, 0, 5).getVehicleAmount();
        orderAmount[1] = mapper.listByOrderAmount(companyId, start, end, 6, 15).getVehicleAmount();
        orderAmount[2] = mapper.listByOrderAmount(companyId, start, end, 16, 30).getVehicleAmount();
        orderAmount[3] = mapper.listByOrderAmount(companyId, start, end, 31, 50).getVehicleAmount();
        orderAmount[4] = mapper.listByOrderAmount(companyId, start, end, 51, 100000).getVehicleAmount();


        String[] xNames = {"0-5单","6-15单","16-30单","31-50单","50单以上"};
        //返回柱状图数据
        if ("col".equals(type)) {
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
            categoryAxis.data(xNames);
            option.xAxis(categoryAxis);


            //左侧订单y轴
            ValueAxis orderNumValue = new ValueAxis();
            orderNumValue.setType(AxisType.value);
            orderNumValue.setName("车辆数");
            orderNumValue.axisLabel().formatter("{value} 辆");

            option.yAxis(orderNumValue);

            Bar totalBar = new Bar();
            totalBar.barMaxWidth(50);
            totalBar.name(lengNames[0]).data(orderAmount);

            option.series(totalBar);

            String optionStr = GsonUtil.format(option);
            return optionStr;
        }

        //返回饼状图数据
        if ("pie".equals(type)) {
            Option option = new Option();
            //option.title().text("未来一周气温变化").subtext("纯属虚构");
            option.tooltip().trigger(Trigger.item);
            option.tooltip().formatter("{a} <br/>{b} : {c} ({d}%)");
            option.legend(xNames);

            /*option.toolbox().show(true).feature(
                    Tool.mark,
                    Tool.dataView,
                    new MagicType(Magic.line, Magic.bar).show(true),
                    Tool.restore,
                    Tool.saveAsImage);*/
            option.calculable(true);

            //图例
            Legend legend = new Legend();
            legend.orient(Orient.vertical).left(X.left).data(xNames);

            Pie pie = new Pie("车辆数");
            pie.radius("55%").center("50%", "60%");

            //设置饼状图数据
            PieData[] pieData = new PieData[xNames.length];
            for(int i=0;i<xNames.length;i++) {
                pieData[i] = new PieData(xNames[i], orderAmount[i]);
            }
            pie.data(pieData);

            //饼状图样式
            ItemStyle itemStyle = new ItemStyle();
            Emphasis emphasis = new Emphasis();
            emphasis.shadowBlur(10).shadowOffsetX(0).shadowColor("rgba(0, 0, 0, 0.5)");
            itemStyle.emphasis(emphasis);
            pie.itemStyle(itemStyle);


            option.series(pie);

            String optionStr = GsonUtil.format(option);
            return optionStr;
        }

        return StateCode.ERROR;
    }
}
