package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.DriverPunish;
import com.wangyueche.bean.entity.DriverPunishExample;
import com.wangyueche.dao.DriverPunishDao;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/17 8:19
 *
 * @author gaojl
 */
@Repository
public class DriverPunishDaoImpl implements DriverPunishDao {
    @Override
    public List<DriverPunish> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        return null;
    }
   /* @Autowired
    private DriverPunishMapper mapper;

    *//**
     * 驾驶员处罚信息
     *
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param licenseId
     * @param startDate
     * @param endDate
     * @return
     *//*
    @Override
    public List<DriverPunish> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        DriverPunishExample example = new DriverPunishExample();
        DriverPunishExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat,numFormat );
                criteria.andPunishTimeEqualTo(date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andPunishTimeBetween(start, end);
        }

        PageHelper.startPage(page, rows);
        List<DriverPunish> list = mapper.selectByExample(example);
        return list;
    }*/
}
