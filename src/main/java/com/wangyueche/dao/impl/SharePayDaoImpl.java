package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.SharePay;
import com.wangyueche.bean.entity.SharePayExample;
import com.wangyueche.dao.SharePayDao;
import com.wangyueche.mybatis.SharePayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:47 .
 */
@Repository
public class SharePayDaoImpl implements SharePayDao {
    @Autowired
    private SharePayMapper mapper;

    @Override
    public List<SharePay> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId, String driverPhone, String vehicleNo) {
        SharePayExample example = new SharePayExample();
        SharePayExample.Criteria criteria = example.createCriteria();

        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        if (StringUtils.hasText(orderId)) {
            criteria.andOrderIdEqualTo(orderId);
        }
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }

        PageHelper.startPage(page, rows);
        List<SharePay> list = mapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
