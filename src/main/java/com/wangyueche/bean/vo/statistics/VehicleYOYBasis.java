package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:39
 * 车辆同比
 * @author gaojl
 */
public class VehicleYOYBasis implements Serializable{
    private static final long serialVersionUID = -8983413635301591741L;
    private String companyId;
    private String companyName;
    private Integer year;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getVehicleAmount() {
        return vehicleAmount;
    }

    public void setVehicleAmount(Integer vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
    }
}
