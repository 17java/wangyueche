package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 21:27
 * 乘客评价信息统计
 *
 * @author gaojl
 */
public class PassengerEvaluationStat implements Serializable {
    private static final long serialVersionUID = 7767735811479231127L;
    private String companyId;
    private String companyName;
    private Double driverScore;
    private Double vehicleScore;
    private Double serviceScore;

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

    public Double getDriverScore() {
        return driverScore;
    }

    public void setDriverScore(Double driverScore) {
        this.driverScore = driverScore;
    }

    public Double getVehicleScore() {
        return vehicleScore;
    }

    public void setVehicleScore(Double vehicleScore) {
        this.vehicleScore = vehicleScore;
    }

    public Double getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Double serviceScore) {
        this.serviceScore = serviceScore;
    }
}
