package com.wangyueche.bean.entity;

import java.io.Serializable;

public class GmCompanyBusinessLicense implements Serializable {
    private Integer id;

    private String companyName;

    private Integer addressCode;

    private String addressName;

    private String address;

    private String operatingState;

    private String economicNature;

    private Double latitude;

    private Double longitude;

    private String operationArea;

    private String operationArea2;

    private String certificate;

    private Integer startDate;

    private Integer stopDate;

    private String organization;

    private Integer certifyDate;

    private Integer flag;

    private Long updateTime;

    private byte[] type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(Integer addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOperatingState() {
        return operatingState;
    }

    public void setOperatingState(String operatingState) {
        this.operatingState = operatingState == null ? null : operatingState.trim();
    }

    public String getEconomicNature() {
        return economicNature;
    }

    public void setEconomicNature(String economicNature) {
        this.economicNature = economicNature == null ? null : economicNature.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(String operationArea) {
        this.operationArea = operationArea == null ? null : operationArea.trim();
    }

    public String getOperationArea2() {
        return operationArea2;
    }

    public void setOperationArea2(String operationArea2) {
        this.operationArea2 = operationArea2 == null ? null : operationArea2.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getStopDate() {
        return stopDate;
    }

    public void setStopDate(Integer stopDate) {
        this.stopDate = stopDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public Integer getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Integer certifyDate) {
        this.certifyDate = certifyDate;
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

    public byte[] getType() {
        return type;
    }

    public void setType(byte[] type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", addressCode=").append(addressCode);
        sb.append(", addressName=").append(addressName);
        sb.append(", address=").append(address);
        sb.append(", operatingState=").append(operatingState);
        sb.append(", economicNature=").append(economicNature);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", operationArea=").append(operationArea);
        sb.append(", operationArea2=").append(operationArea2);
        sb.append(", certificate=").append(certificate);
        sb.append(", startDate=").append(startDate);
        sb.append(", stopDate=").append(stopDate);
        sb.append(", organization=").append(organization);
        sb.append(", certifyDate=").append(certifyDate);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}