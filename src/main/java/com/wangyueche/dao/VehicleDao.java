package com.wangyueche.dao;

import com.wangyueche.bean.entity.VehicleInfo;

import java.util.List;

/**
 * Created by Gavin on 2017/4/12.
 */
public interface VehicleDao {
    VehicleInfo selectVehicle(Integer address, String companyId, String vehicleNo);

    List<VehicleInfo> listForPage(int page, int pageSize, Integer address, String companyId, String vehicleNo, Integer state);

    List<VehicleInfo> selectByAddress(Integer address);

    /**
     * 车辆总数量
     */
    long getTotalVehicle();

    /**
     * 平台公司车辆总数量
     */
    long getCompanyTotalVehicle(String companyId);

    /**
     * 平台公司运营车辆总数量
     */
    long getCompanyTotalScaleVehicle(String companyId);
}
