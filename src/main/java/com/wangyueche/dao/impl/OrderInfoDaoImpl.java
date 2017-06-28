package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.OrderInfoExample;
import com.wangyueche.dao.OrderInfoDao;
import com.wangyueche.mybatis.OrderInfoMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 11:08
 *
 * @author gaojl
 */
@Repository
public class OrderInfoDaoImpl implements OrderInfoDao {
    @Autowired
    private OrderInfoMapper mapper;

    @Override
    public List<OrderInfo> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String orderId, String licenseId, String vehicleNo, String driverPhone) {
        OrderInfoExample example = new OrderInfoExample();
        example.setOrderByClause("order_time desc");
        OrderInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(orderId)) {
            criteria.andOrderIdEqualTo(orderId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat,numFormat );
                criteria.andOrderTimeEqualTo(date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andOrderTimeBetween(start, end);
        }
        PageHelper.startPage(page, rows);
        List<OrderInfo> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public List<OrderInfo> selectByVehicleNo(String vehicleNo) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andVehicleNoEqualTo(vehicleNo);
        List<OrderInfo> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public List<OrderInfo> selectByLicenseId(String licenseId) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLicenseIdEqualTo(licenseId);
        List<OrderInfo> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public List<OrderInfo> selectByDriverPhone(String driverPhone) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andDriverPhoneEqualTo(driverPhone);
        List<OrderInfo> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public OrderInfo selectByOrderId(String orderId) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<OrderInfo> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public long getTotalOrder() {
        OrderInfoExample example = new OrderInfoExample();
        long totalOrder = mapper.countByExample(example);
        return totalOrder;
    }

    @Override
    public long getTotalSuccessOrder() {
        return 0;
    }

    @Override
    public long getCompanyTotalOrder(String companyId) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        long companyTotalOrder = mapper.countByExample(example);
        return companyTotalOrder;
    }

    @Override
    public long getCompanyTotalSuccessOrder(String companyId) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        return 0;
    }
}
