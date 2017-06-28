package com.wangyueche.bean.entity;

import java.io.Serializable;

public class OrderInfo implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String orderId;

    private Long departTime;

    private Long orderTime;

    private String passengerNote;

    private String departure;

    private Double depLongitude;

    private Double depLatitude;

    private String destination;

    private Double destLongitude;

    private Double destLatitude;

    private Integer encrypt;

    private String fareType;

    private Double longitude;

    private Double latitude;

    private String licenseId;

    private String driverPhone;

    private String vehicleNo;

    private Long distributeTime;

    private Long cancelTime;

    private String operator;

    private String cancelTypeCode;

    private String cancelReason;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Long departTime) {
        this.departTime = departTime;
    }

    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    public String getPassengerNote() {
        return passengerNote;
    }

    public void setPassengerNote(String passengerNote) {
        this.passengerNote = passengerNote == null ? null : passengerNote.trim();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public Double getDepLongitude() {
        return depLongitude;
    }

    public void setDepLongitude(Double depLongitude) {
        this.depLongitude = depLongitude;
    }

    public Double getDepLatitude() {
        return depLatitude;
    }

    public void setDepLatitude(Double depLatitude) {
        this.depLatitude = depLatitude;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Double getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Double destLongitude) {
        this.destLongitude = destLongitude;
    }

    public Double getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Double destLatitude) {
        this.destLatitude = destLatitude;
    }

    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType == null ? null : fareType.trim();
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

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Long getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Long distributeTime) {
        this.distributeTime = distributeTime;
    }

    public Long getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Long cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getCancelTypeCode() {
        return cancelTypeCode;
    }

    public void setCancelTypeCode(String cancelTypeCode) {
        this.cancelTypeCode = cancelTypeCode == null ? null : cancelTypeCode.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
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
        sb.append(", orderId=").append(orderId);
        sb.append(", departTime=").append(departTime);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", passengerNote=").append(passengerNote);
        sb.append(", departure=").append(departure);
        sb.append(", depLongitude=").append(depLongitude);
        sb.append(", depLatitude=").append(depLatitude);
        sb.append(", destination=").append(destination);
        sb.append(", destLongitude=").append(destLongitude);
        sb.append(", destLatitude=").append(destLatitude);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", fareType=").append(fareType);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", driverPhone=").append(driverPhone);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", distributeTime=").append(distributeTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", operator=").append(operator);
        sb.append(", cancelTypeCode=").append(cancelTypeCode);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}