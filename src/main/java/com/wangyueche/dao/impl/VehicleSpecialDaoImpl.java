package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.OrderInfoExample;
import com.wangyueche.dao.VehicleSpecialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 10:26 .
 */
@Repository
public class VehicleSpecialDaoImpl implements VehicleSpecialDao {
    @Override
    public List<OrderInfo> list(Integer page, Integer rows, String companyId, String vehicleNo, String orderId, Long depLong, Long depLat, Long destLong, Long destLat, Long startDate, Long endDate) {
        return null;
    }
    /*@Autowired
    private OrderInfoMapper mapper;

    @Override
    public List<OrderInfo> list(Integer page, Integer rows, String companyId, String vehicleNo, String orderId, Long depLong, Long depLat, Long destLong, Long destLat, Long startDate, Long endDate) {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();

        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }
        if (StringUtils.hasText(orderId)) {
            criteria.andOrderIdEqualTo(orderId);
        }
        //200可选误差范围
        if (depLong != null && depLat != null) {
            criteria.andDepLongitudeBetween((double) (depLong - 200), (double) depLong + 200);
            criteria.andDepLatitudeBetween((double) (depLat - 200), (double) depLat + 200);
        }
        if (destLong != null && destLat != null) {
            criteria.andDestLongitudeBetween((double) (destLong - 200), (double) destLong + 200);
            criteria.andDestLatitudeBetween((double) (destLat - 200), (double) destLat + 200);
        }

        if (startDate != null && endDate != null) {
            criteria.andOrderTimeBetween(startDate, endDate);
        }
        PageHelper.startPage(page, rows);
        List<OrderInfo> list = mapper.selectByExample(example);

        return list;
    }*/
}
