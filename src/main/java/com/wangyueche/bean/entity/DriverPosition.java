package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class DriverPosition implements Serializable {
    private Integer id;

    private String companyId;

    private String licenseId;

    private Integer driverRegionCode;

    private String vehicleNo;

    private Long positionTime;

    private Double longitude;

    private Double latitude;

    private Integer encrypt;

    private BigDecimal direction;

    private BigDecimal elevation;

    private BigDecimal speed;

    private Integer bizStatus;

    private String orderId;

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

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public Integer getDriverRegionCode() {
        return driverRegionCode;
    }

    public void setDriverRegionCode(Integer driverRegionCode) {
        this.driverRegionCode = driverRegionCode;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Long positionTime) {
        this.positionTime = positionTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", driverRegionCode=").append(driverRegionCode);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", positionTime=").append(positionTime);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", direction=").append(direction);
        sb.append(", elevation=").append(elevation);
        sb.append(", speed=").append(speed);
        sb.append(", bizStatus=").append(bizStatus);
        sb.append(", orderId=").append(orderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}