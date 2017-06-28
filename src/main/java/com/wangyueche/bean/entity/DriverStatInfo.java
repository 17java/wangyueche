package com.wangyueche.bean.entity;

import java.io.Serializable;

public class DriverStatInfo implements Serializable {
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

    private static final long serialVersionUID = 1L;

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
        this.companyId = companyId == null ? null : companyId.trim();
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
        this.licenseId = licenseId == null ? null : licenseId.trim();
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
        this.orderCount = orderCount == null ? null : orderCount.trim();
    }

    public String getTrafficViolationCount() {
        return trafficViolationCount;
    }

    public void setTrafficViolationCount(String trafficViolationCount) {
        this.trafficViolationCount = trafficViolationCount == null ? null : trafficViolationCount.trim();
    }

    public String getComplainedCount() {
        return complainedCount;
    }

    public void setComplainedCount(String complainedCount) {
        this.complainedCount = complainedCount == null ? null : complainedCount.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", address=").append(address);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", cycle=").append(cycle);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", trafficViolationCount=").append(trafficViolationCount);
        sb.append(", complainedCount=").append(complainedCount);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}