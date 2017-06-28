package com.wangyueche.dao;

import com.wangyueche.bean.entity.VehicleTotalMile;

import java.util.List;

/**
 * Created by gaojl on 2017/4/13 18:01
 *
 * @author gaojl
 */
public interface VehicleTotalMileDao {
    List<VehicleTotalMile> listForPage(int page, int rows, Integer address, String companyId, String vehicleNo);
}
