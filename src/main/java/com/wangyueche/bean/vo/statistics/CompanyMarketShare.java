package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/28 22:09
 * 平台市场占有率
 * @author gaojl
 */
public class CompanyMarketShare implements Serializable {
    private static final long serialVersionUID = 3090732984844662755L;
    private String companyId;
    private String companyName;
    // 平台车辆数
    private Integer totalVehicle;
    //平台驾驶员数
    private Integer totalDriver;

    public Integer getTotalVehicle() {
        return totalVehicle;
    }

    public void setTotalVehicle(Integer totalVehicle) {
        this.totalVehicle = totalVehicle;
    }

    public Integer getTotalDriver() {
        return totalDriver;
    }

    public void setTotalDriver(Integer totalDriver) {
        this.totalDriver = totalDriver;
    }

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

    @Override
    public String toString() {
        return "CompanyMarketShare{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", totalVehicle=" + totalVehicle +
                ", totalDriver=" + totalDriver +
                '}';
    }
}
