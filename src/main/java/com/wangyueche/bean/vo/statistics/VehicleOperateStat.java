package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/5/2 20:42
 * 车辆运行信息
 *
 * @author gaojl
 */
public class VehicleOperateStat implements Serializable{
    private static final long serialVersionUID = 4352683568683360128L;
    private String companyId;
    private String companyName;
    //总行驶里程
    private BigDecimal totalMile;
    //总载客里程
    private BigDecimal totalDriveMile;
    //总载客时间
    private Long totalDriveTime;

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

    public BigDecimal getTotalMile() {
        return totalMile;
    }

    public void setTotalMile(BigDecimal totalMile) {
        this.totalMile = totalMile;
    }

    public BigDecimal getTotalDriveMile() {
        return totalDriveMile;
    }

    public void setTotalDriveMile(BigDecimal totalDriveMile) {
        this.totalDriveMile = totalDriveMile;
    }

    public Long getTotalDriveTime() {
        return totalDriveTime;
    }

    public void setTotalDriveTime(Long totalDriveTime) {
        this.totalDriveTime = totalDriveTime;
    }
}
