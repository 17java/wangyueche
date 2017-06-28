package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.entity.DriverInfoExample;
import com.wangyueche.dao.DriverInfoDao;
import com.wangyueche.mybatis.DriverInfoMapper;
import com.wangyueche.util.base.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/13 6:42
 *
 * @author gaojl
 */
@Repository
public class DriverInfoDaoImpl implements DriverInfoDao {
    @Autowired
    private DriverInfoMapper mapper;

    /**
     * 综合信息——驾驶员信息——基本信息
     *
     * @param address     归属区划id
     * @param companyId   公司标识
     * @param licenseId   驾驶证号
     * @param driverPhone 驾驶员手机号
     * @return
     */
    @Override
    public DriverInfo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone) {
        DriverInfoExample example = new DriverInfoExample();
        DriverInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        List<DriverInfo> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 基本信息——基础信息——驾驶员信息
     *
     * @param page
     * @param pageSize
     * @param companyId
     * @param state
     * @return
     */
    @Override
    public List<DriverInfo> listForPage(int page, int pageSize, Integer address,String companyId,String licenseId,String driverName,Integer state) {
        DriverInfoExample example = new DriverInfoExample();
        DriverInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(driverName)) {
            criteria.andDriverNameEqualTo(driverName);
        }
        if (state != null) {
            criteria.andStateEqualTo(state);
        }

        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        page = SqlUtil.checkPageCurrent(totalCount, pageSize, page);

        PageHelper.startPage(page, pageSize);
        List<DriverInfo> list = mapper.selectByExample(example);
        return list;
    }

    /**
     * 通过手机号查找驾驶员信息
     *
     * @param driverPhone
     * @return
     */
    @Override
    public DriverInfo selectByDriverPhone(String driverPhone) {
        DriverInfoExample example = new DriverInfoExample();
        DriverInfoExample.Criteria criteria= example.createCriteria();
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        List<DriverInfo> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
