package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.DriverApp;
import com.wangyueche.bean.entity.DriverAppExample;
import com.wangyueche.dao.DriverAppDao;
import com.wangyueche.mybatis.DriverAppMapper;
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
public class DriverAppDaoImpl implements DriverAppDao {
    @Autowired
    private DriverAppMapper mapper;

    /**
     * 综合信息——驾驶员信息——移动终端信息
     *
     * @param companyId
     * @param licenseId
     * @param driverPhone
     * @return
     */
    @Override
    public DriverApp selectDriverApp(String companyId, String licenseId, String driverPhone) {
        DriverAppExample example = new DriverAppExample();
        DriverAppExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        List<DriverApp> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 基本信息——基础信息——驾驶员移动终端信息
     *
     * @param address     归属区划
     * @param companyId   公司标识
     * @param driverPhone 驾驶员手机号
     * @param state       状态
     * @return
     */
    @Override
    public List<DriverApp> listForPage(int page,int pageSize,Integer address, String companyId, String licenseId,String driverPhone, Integer state) {
        DriverAppExample example = new DriverAppExample();
        DriverAppExample.Criteria criteria = example.createCriteria();
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
        if (state != null) {
            criteria.andStateEqualTo(state);
        }
        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        page = SqlUtil.checkPageCurrent(totalCount, pageSize, page);

        PageHelper.startPage(page, pageSize);
        List<DriverApp> list = mapper.selectByExample(example);
        return list;
    }
}
