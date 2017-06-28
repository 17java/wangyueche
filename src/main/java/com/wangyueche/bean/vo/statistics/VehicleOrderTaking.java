package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:01
 * 车辆接单量
 *
 * @author gaojl
 */
public class VehicleOrderTaking implements Serializable {
    private static final long serialVersionUID = 8435000561018538545L;
    private String companyId;
    private String companyName;
    //接单量范围内的数量
    private Integer vehicleAmount;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getVehicleAmount() {
        return vehicleAmount;
    }

    public void setVehicleAmount(Integer vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
    }
}
