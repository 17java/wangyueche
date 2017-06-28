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
import com.github.abel533.echarts.series.Line;
import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CreditCompany;
import com.wangyueche.bean.entity.CreditCompanyExample;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.dao.CreditCompanyDao;
import com.wangyueche.mybatis.CreditCompanyMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.credit.CreditCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/23 15:02 .
 */
@Service
public class CreditCompanyServiceImpl implements CreditCompanyService {
    @Autowired
    private CreditCompanyDao dao;

    @Autowired
    private CreditCompanyMapper mapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult list(Integer page, Integer rows, String companyId) {
        List<CreditCompany> list = dao.list(page, rows, companyId);
        if (list != null && list.size() > 0) {
            EasyUIResult result = new EasyUIResult();
            PageInfo<CreditCompany> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            result.setRows(list);
            return result;
        }
        return null;
    }

    @Override
    public String showStarStat() {
        Map<String, String> map = infoService.idWithName();

        //key:公司名称
        //value:公司对应星级占比
        Map<String, Double[]> result = new HashMap<>();

        //存放公司名称
        String[] companyNames = new String[map.size()];

        int index = 0;
        for (String companyId : map.keySet()) {
            companyNames[index] = map.get(companyId);
            index++;

            CreditCompanyExample example1 = new CreditCompanyExample();
            CreditCompanyExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andCompanyIdEqualTo(companyId);
            int total = mapper.countByExample(example1);

            //统计每个星级占比
            Double[] value = new Double[6];
            for (int i = 0; i < value.length; i++) {
                //如果当前公司评价总数为0，则所有星级统计都为0
                if (total == 0) {
                    value[i] = 0.0;
                    continue;
                }

                CreditCompanyExample example = new CreditCompanyExample();
                CreditCompanyExample.Criteria criteria = example.createCriteria();
                criteria.andCompanyIdEqualTo(companyId).andStarEqualTo(i);
                int num = mapper.countByExample(example);

                value[i] = Math.round(num * 10000 / total) / 100.0;
            }
            result.put(map.get(companyId), value);
        }

        /*************************************统计图********************************/

        Option option = new Option();
        option.tooltip().trigger(Trigger.axis).axisPointer();
        option.legend(companyNames);

        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar).show(true),
                Tool.restore,
                Tool.saveAsImage);
        option.calculable(true);

        //设置x轴
        String[] xNames = {"0星", "1星", "2星", "3星", "4星", "5星"};
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(xNames);
        option.xAxis(categoryAxis);


        //左侧y轴
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setType(AxisType.value);
        valueAxis.setName("百分比");
        valueAxis.max(100).min(0);
        valueAxis.axisLabel().formatter("{value} %");

        option.yAxis(valueAxis);

        //创建数据折线图
        Line[] lines = new Line[companyNames.length];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(companyNames[i]);
            lines[i].data(result.get(companyNames[i]));
        }

        option.series(lines);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }

    @Override
    public String showSatisStat() {
        Map<String, String> map = infoService.idWithName();

        //key:公司名称
        //value:公司对应满意度占比
        Map<String, Double[]> result = new HashMap<>();

        //存放公司名称
        String[] companyNames = new String[map.size()];

        int index = 0;
        for (String companyId : map.keySet()) {
            companyNames[index] = map.get(companyId);
            index++;

            CreditCompanyExample example1 = new CreditCompanyExample();
            CreditCompanyExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andCompanyIdEqualTo(companyId);
            int total = mapper.countByExample(example1);
            System.out.println("satis" + total+":"+companyId);
            //统计每个满意度占比
            Double[] value = new Double[3];
            for (int i = 0; i < value.length; i++) {
                //如果当前公司评价总数为0，则所有星级统计都为0
                if (total == 0) {
                    value[i] = 0.0;
                    continue;
                }

                CreditCompanyExample example = new CreditCompanyExample();
                CreditCompanyExample.Criteria criteria = example.createCriteria();
                criteria.andCompanyIdEqualTo(companyId).andScoreEqualTo(i + 1);
                int num = mapper.countByExample(example);

                value[i] = Math.round(num * 10000 / total) / 100.0;
            }
            result.put(map.get(companyId), value);
        }

        /*************************************统计图********************************/
        
        Option option = new Option();
        option.tooltip().trigger(Trigger.axis).axisPointer();
        option.legend(companyNames);

        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar).show(true),
                Tool.restore,
                Tool.saveAsImage);
        option.calculable(true);

        //设置x轴
        String[] xNames = {"满意","一般","不满意"};
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.data(xNames);
        option.xAxis(categoryAxis);

        //左侧y轴
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setType(AxisType.value);
        valueAxis.setName("百分比");
        valueAxis.max(100).min(0);
        valueAxis.axisLabel().formatter("{value} %");

        option.yAxis(valueAxis);

        //创建数据折线图
        Bar[] bars = new Bar[companyNames.length];
        for (int i = 0; i < bars.length; i++) {
            bars[i] = new Bar(companyNames[i]);
            bars[i].data(result.get(companyNames[i])).barMaxWidth(50);
        }

        option.series(bars);

        String optionStr = GsonUtil.format(option);
        return optionStr;
    }
}
