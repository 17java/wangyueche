package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.AlarmInformations;
import com.wangyueche.bean.entity.AlarmInformationsExample;
import com.wangyueche.dao.AlarmInfoDao;
import com.wangyueche.mybatis.AlarmInformationsMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by gaojl on 2017/6/1 8:30 .
 * 运营监管——报警信息查询
 */
@Repository
public class AlarmInfoDaoImpl implements AlarmInfoDao {
    @Autowired
    private AlarmInformationsMapper mapper;

    @Override
    public List<AlarmInformations> list(Integer page, Integer rows, String type, String startDate, String endDate) {
        AlarmInformationsExample example = new AlarmInformationsExample();
        AlarmInformationsExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(type)) {
            criteria.andTypeEqualTo(type);
        }
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            if (startDate.equals(endDate)) {
                Date date = DateUtil.parseDate(startDate, dateFormat);
                criteria.andDateEqualTo(date);
            }
            Date start = DateUtil.parseDate(startDate, dateFormat);
            Date end = DateUtil.parseDate(endDate, dateFormat);
            criteria.andDateBetween(start, end);
        }

        PageHelper.startPage(page, rows);
        List<AlarmInformations> list = mapper.selectByExample(example);
        return list;
    }
}
