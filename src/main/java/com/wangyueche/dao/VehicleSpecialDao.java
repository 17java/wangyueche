package com.wangyueche.dao;

import com.wangyueche.bean.entity.OrderInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 10:06 .
 * 特殊车辆查找
 */
public interface VehicleSpecialDao {
    List<OrderInfo> list(Integer page, Integer rows, String companyId, String vehicleNo, String orderId, Long depLong, Long depLat, Long destLong, Long destLat, Long startDate, Long endDate);
}
