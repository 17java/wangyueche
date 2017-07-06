package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.dao.VehicleBeyondOperateDao;
import com.wangyueche.mapper.VehicleBeyondOperateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 9:32 .
 */
@Repository
public class VehicleBeyondOperateDaoImpl implements VehicleBeyondOperateDao {
    @Override
    public List<OperateDepartArrive> list(Integer page, Integer rows, String vehicleNo, Long startDate, Long endDate) {
        return null;
    }
    /*@Autowired
    private VehicleBeyondOperateMapper mapper;

    @Override
    public List<OperateDepartArrive> list(Integer page, Integer rows, String vehicleNo, Long startDate, Long endDate) {
        PageHelper.startPage(page, rows);
        List<OperateDepartArrive> list = mapper.list(vehicleNo, startDate, endDate);
        return list;
    }*/
}
