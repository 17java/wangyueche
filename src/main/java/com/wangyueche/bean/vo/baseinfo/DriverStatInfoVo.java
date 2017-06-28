package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.DriverStatInfo;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 15:32
 *
 * @author gaojl
 */
public class DriverStatInfoVo implements Serializable {
    private static final long serialVersionUID = 8157813576945902049L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String licenseId;

    private Integer cycle;

    private String orderCount;

    private String trafficViolationCount;

    private String complainedCount;

    private Integer flag;

    private Long updateTime;

    private String companyName;


    public DriverStatInfoVo(DriverStatInfo driverStatInfo) {
        this.id = driverStatInfo.getId();
        this.companyId = driverStatInfo.getCompanyId();
        this.address = driverStatInfo.getAddress();
        this.licenseId = driverStatInfo.getLicenseId();
        this.cycle = driverStatInfo.getCycle();
        this.orderCount = driverStatInfo.getOrderCount();
        this.trafficViolationCount = driverStatInfo.getTrafficViolationCount();
        this.complainedCount = driverStatInfo.getComplainedCount();
        this.flag = driverStatInfo.getFlag();
        this.updateTime = driverStatInfo.getUpdateTime();
    }

    public DriverStatInfoVo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getTrafficViolationCount() {
        return trafficViolationCount;
    }

    public void setTrafficViolationCount(String trafficViolationCount) {
        this.trafficViolationCount = trafficViolationCount;
    }

    public String getComplainedCount() {
        return complainedCount;
    }

    public void setComplainedCount(String complainedCount) {
        this.complainedCount = complainedCount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
