package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.entity.DriverReputationExample;
import com.wangyueche.dao.DriverReputationDao;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/17 8:33
 *
 * @author gaojl
 */
@Repository
public class DriverReputationDaoImpl implements DriverReputationDao {
    @Override
    public List<DriverReputation> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        return null;
    }
    /*@Autowired
    private DriverReputationMapper mapper;

    *//**
     * 驾驶员信誉信息
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
    public List<DriverReputation> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        DriverReputationExample example = new DriverReputationExample();
        DriverReputationExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "YYYY-MM-DD HH:mm:ss";
            String numFormat = "YYYYMMDD";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat,numFormat );
                criteria.andTestDateEqualTo((int)date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andTestDateBetween((int)start, (int)end);
        }

        PageHelper.startPage(page, rows);
        List<DriverReputation> list = mapper.selectByExample(example);
        return list;
    }*/
}
