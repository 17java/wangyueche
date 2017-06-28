package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class SharePay implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String routeId;

    private String orderId;

    private String driverPhone;

    private String licenseId;

    private String vehicleNo;

    private String fareType;

    private Long bookDepartTime;

    private Long departTime;

    private String departure;

    private Double depLongitude;

    private Double depLatitude;

    private Long destTime;

    private String destination;

    private Double destLongitude;

    private Double destLatitude;

    private Integer encrypt;

    private BigDecimal driveMile;

    private Long driveTime;

    private BigDecimal facePrice;

    private BigDecimal price;

    private BigDecimal cashPrice;

    private String lineName;

    private BigDecimal linePrice;

    private BigDecimal benfitPrice;

    private BigDecimal shareFueFee;

    private BigDecimal shareHighwayToll;

    private BigDecimal passengerTip;

    private BigDecimal shareOther;

    private String payState;

    private Integer passengerNum;

    private Long payTime;

    private Long orderMatchTime;

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

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
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

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType == null ? null : fareType.trim();
    }

    public Long getBookDepartTime() {
        return bookDepartTime;
    }

    public void setBookDepartTime(Long bookDepartTime) {
        this.bookDepartTime = bookDepartTime;
    }

    public Long getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Long departTime) {
        this.departTime = departTime;
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

    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
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

    public BigDecimal getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(BigDecimal driveMile) {
        this.driveMile = driveMile;
    }

    public Long getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Long driveTime) {
        this.driveTime = driveTime;
    }

    public BigDecimal getFacePrice() {
        return facePrice;
    }

    public void setFacePrice(BigDecimal facePrice) {
        this.facePrice = facePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public BigDecimal getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(BigDecimal linePrice) {
        this.linePrice = linePrice;
    }

    public BigDecimal getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(BigDecimal benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    public BigDecimal getShareFueFee() {
        return shareFueFee;
    }

    public void setShareFueFee(BigDecimal shareFueFee) {
        this.shareFueFee = shareFueFee;
    }

    public BigDecimal getShareHighwayToll() {
        return shareHighwayToll;
    }

    public void setShareHighwayToll(BigDecimal shareHighwayToll) {
        this.shareHighwayToll = shareHighwayToll;
    }

    public BigDecimal getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(BigDecimal passengerTip) {
        this.passengerTip = passengerTip;
    }

    public BigDecimal getShareOther() {
        return shareOther;
    }

    public void setShareOther(BigDecimal shareOther) {
        this.shareOther = shareOther;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    public Integer getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(Integer passengerNum) {
        this.passengerNum = passengerNum;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getOrderMatchTime() {
        return orderMatchTime;
    }

    public void setOrderMatchTime(Long orderMatchTime) {
        this.orderMatchTime = orderMatchTime;
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
        sb.append(", routeId=").append(routeId);
        sb.append(", orderId=").append(orderId);
        sb.append(", driverPhone=").append(driverPhone);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", fareType=").append(fareType);
        sb.append(", bookDepartTime=").append(bookDepartTime);
        sb.append(", departTime=").append(departTime);
        sb.append(", departure=").append(departure);
        sb.append(", depLongitude=").append(depLongitude);
        sb.append(", depLatitude=").append(depLatitude);
        sb.append(", destTime=").append(destTime);
        sb.append(", destination=").append(destination);
        sb.append(", destLongitude=").append(destLongitude);
        sb.append(", destLatitude=").append(destLatitude);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", driveMile=").append(driveMile);
        sb.append(", driveTime=").append(driveTime);
        sb.append(", facePrice=").append(facePrice);
        sb.append(", price=").append(price);
        sb.append(", cashPrice=").append(cashPrice);
        sb.append(", lineName=").append(lineName);
        sb.append(", linePrice=").append(linePrice);
        sb.append(", benfitPrice=").append(benfitPrice);
        sb.append(", shareFueFee=").append(shareFueFee);
        sb.append(", shareHighwayToll=").append(shareHighwayToll);
        sb.append(", passengerTip=").append(passengerTip);
        sb.append(", shareOther=").append(shareOther);
        sb.append(", payState=").append(payState);
        sb.append(", passengerNum=").append(passengerNum);
        sb.append(", payTime=").append(payTime);
        sb.append(", orderMatchTime=").append(orderMatchTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}