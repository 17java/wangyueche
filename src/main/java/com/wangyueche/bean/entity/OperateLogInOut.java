package com.wangyueche.bean.entity;

import java.io.Serializable;

public class OperateLogInOut implements Serializable {
    private Integer id;

    private String companyId;

    private String licenseId;

    private String vehicleNo;

    private Long loginTime;

    private Double inLongitude;

    private Double inLatitude;

    private Integer inEncrypt;

    private Long logoutTime;

    private Double outLongitude;

    private Double outLatitude;

    private Integer outEncrypt;

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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public Double getInLongitude() {
        return inLongitude;
    }

    public void setInLongitude(Double inLongitude) {
        this.inLongitude = inLongitude;
    }

    public Double getInLatitude() {
        return inLatitude;
    }

    public void setInLatitude(Double inLatitude) {
        this.inLatitude = inLatitude;
    }

    public Integer getInEncrypt() {
        return inEncrypt;
    }

    public void setInEncrypt(Integer inEncrypt) {
        this.inEncrypt = inEncrypt;
    }

    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Double getOutLongitude() {
        return outLongitude;
    }

    public void setOutLongitude(Double outLongitude) {
        this.outLongitude = outLongitude;
    }

    public Double getOutLatitude() {
        return outLatitude;
    }

    public void setOutLatitude(Double outLatitude) {
        this.outLatitude = outLatitude;
    }

    public Integer getOutEncrypt() {
        return outEncrypt;
    }

    public void setOutEncrypt(Integer outEncrypt) {
        this.outEncrypt = outEncrypt;
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
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", inLongitude=").append(inLongitude);
        sb.append(", inLatitude=").append(inLatitude);
        sb.append(", inEncrypt=").append(inEncrypt);
        sb.append(", logoutTime=").append(logoutTime);
        sb.append(", outLongitude=").append(outLongitude);
        sb.append(", outLatitude=").append(outLatitude);
        sb.append(", outEncrypt=").append(outEncrypt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}