package com.wangyueche.dao;

import com.wangyueche.bean.entity.VehicleInsurance;

import java.util.List;

/**
 * Created by gaojl on 2017/4/13 17:07
 *
 * @author gaojl
 */
public interface VehicleInsuranceDao {
    List<VehicleInsurance> listForPage(int page, int rows, Integer address, String companyId, String vehicleNO,String insurCom);
}
