package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:34
 * 超经营区域车辆统计
 *
 * @author gaojl
 */
public class VehicleBeyondOperateStat implements Serializable {
    private static final long serialVersionUID = 551441187824395842L;
    private String companyId;
    private String companyName;
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
