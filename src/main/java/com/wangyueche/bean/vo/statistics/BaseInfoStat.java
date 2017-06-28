package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/11 16:12 .
 * 用于企业首页展现
 */
public class BaseInfoStat implements Serializable{
    private static final long serialVersionUID = -3770390191747755957L;
    private Integer companyCount;
    private Integer driverCount;
    private Integer vehicleCount;
    private Integer orderRealTime;
    private Integer vehicleRealTime;

    public Integer getOrderRealTime() {
        return orderRealTime;
    }

    public void setOrderRealTime(Integer orderRealTime) {
        this.orderRealTime = orderRealTime;
    }

    public Integer getVehicleRealTime() {
        return vehicleRealTime;
    }

    public void setVehicleRealTime(Integer vehicleRealTime) {
        this.vehicleRealTime = vehicleRealTime;
    }

    public Integer getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(Integer companyCount) {
        this.companyCount = companyCount;
    }

    public Integer getDriverCount() {
        return driverCount;
    }

    public void setDriverCount(Integer driverCount) {
        this.driverCount = driverCount;
    }

    public Integer getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(Integer vehicleCount) {
        this.vehicleCount = vehicleCount;
    }
}
