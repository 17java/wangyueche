package com.wangyueche.dao;

import com.wangyueche.bean.entity.OperateDepartArrive;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 9:31 .
 */
public interface VehicleBeyondOperateDao {
    List<OperateDepartArrive> list(Integer page, Integer rows, String vehicleNo, Long startDate, Long endDate);
}
