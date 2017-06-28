package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OperateDepartArrive implements Serializable {
    private Integer id;

    private String companyId;

    private String orderId;

    private Integer onArea;

    private String driverName;

    private String licenseId;

    private String fareType;

    private String vehicleNo;

    private Long bookDepTime;

    private Long waitTime;

    private Double depLongitude;

    private Double depLatitude;

    private String depArea;

    private Long depTime;

    private Integer encrypt;

    private Double destLongitude;

    private Double destLatitude;

    private String destArea;

    private Long destTime;

    private String bookModel;

    private String model;

    private BigDecimal driveMile;

    private Integer driveTime;

    private BigDecimal waitMile;

    private BigDecimal factPrice;

    private BigDecimal price;

    private BigDecimal cashPrice;

    private String lineName;

    private BigDecimal linePrice;

    private String posName;

    private BigDecimal posPrice;

    private BigDecimal benfitPrice;

    private BigDecimal bookTip;

    private Integer passengerTip;

    private BigDecimal peakUpPrice;

    private BigDecimal nightUpPrice;

    private BigDecimal farUpPrice;

    private BigDecimal otherUpPrice;

    private String payState;

    private Long payTime;

    private Long orderMatchTime;

    private String invoiceStatus;

    private Integer beginBeyondOperate;

    private Integer endBeyondOperate;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getOnArea() {
        return onArea;
    }

    public void setOnArea(Integer onArea) {
        this.onArea = onArea;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType == null ? null : fareType.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Long getBookDepTime() {
        return bookDepTime;
    }

    public void setBookDepTime(Long bookDepTime) {
        this.bookDepTime = bookDepTime;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
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

    public String getDepArea() {
        return depArea;
    }

    public void setDepArea(String depArea) {
        this.depArea = depArea == null ? null : depArea.trim();
    }

    public Long getDepTime() {
        return depTime;
    }

    public void setDepTime(Long depTime) {
        this.depTime = depTime;
    }

    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
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

    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea == null ? null : destArea.trim();
    }

    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
    }

    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel == null ? null : bookModel.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public BigDecimal getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(BigDecimal driveMile) {
        this.driveMile = driveMile;
    }

    public Integer getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Integer driveTime) {
        this.driveTime = driveTime;
    }

    public BigDecimal getWaitMile() {
        return waitMile;
    }

    public void setWaitMile(BigDecimal waitMile) {
        this.waitMile = waitMile;
    }

    public BigDecimal getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
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

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName == null ? null : posName.trim();
    }

    public BigDecimal getPosPrice() {
        return posPrice;
    }

    public void setPosPrice(BigDecimal posPrice) {
        this.posPrice = posPrice;
    }

    public BigDecimal getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(BigDecimal benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    public BigDecimal getBookTip() {
        return bookTip;
    }

    public void setBookTip(BigDecimal bookTip) {
        this.bookTip = bookTip;
    }

    public Integer getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(Integer passengerTip) {
        this.passengerTip = passengerTip;
    }

    public BigDecimal getPeakUpPrice() {
        return peakUpPrice;
    }

    public void setPeakUpPrice(BigDecimal peakUpPrice) {
        this.peakUpPrice = peakUpPrice;
    }

    public BigDecimal getNightUpPrice() {
        return nightUpPrice;
    }

    public void setNightUpPrice(BigDecimal nightUpPrice) {
        this.nightUpPrice = nightUpPrice;
    }

    public BigDecimal getFarUpPrice() {
        return farUpPrice;
    }

    public void setFarUpPrice(BigDecimal farUpPrice) {
        this.farUpPrice = farUpPrice;
    }

    public BigDecimal getOtherUpPrice() {
        return otherUpPrice;
    }

    public void setOtherUpPrice(BigDecimal otherUpPrice) {
        this.otherUpPrice = otherUpPrice;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
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

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    public Integer getBeginBeyondOperate() {
        return beginBeyondOperate;
    }

    public void setBeginBeyondOperate(Integer beginBeyondOperate) {
        this.beginBeyondOperate = beginBeyondOperate;
    }

    public Integer getEndBeyondOperate() {
        return endBeyondOperate;
    }

    public void setEndBeyondOperate(Integer endBeyondOperate) {
        this.endBeyondOperate = endBeyondOperate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", orderId=").append(orderId);
        sb.append(", onArea=").append(onArea);
        sb.append(", driverName=").append(driverName);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", fareType=").append(fareType);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", bookDepTime=").append(bookDepTime);
        sb.append(", waitTime=").append(waitTime);
        sb.append(", depLongitude=").append(depLongitude);
        sb.append(", depLatitude=").append(depLatitude);
        sb.append(", depArea=").append(depArea);
        sb.append(", depTime=").append(depTime);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", destLongitude=").append(destLongitude);
        sb.append(", destLatitude=").append(destLatitude);
        sb.append(", destArea=").append(destArea);
        sb.append(", destTime=").append(destTime);
        sb.append(", bookModel=").append(bookModel);
        sb.append(", model=").append(model);
        sb.append(", driveMile=").append(driveMile);
        sb.append(", driveTime=").append(driveTime);
        sb.append(", waitMile=").append(waitMile);
        sb.append(", factPrice=").append(factPrice);
        sb.append(", price=").append(price);
        sb.append(", cashPrice=").append(cashPrice);
        sb.append(", lineName=").append(lineName);
        sb.append(", linePrice=").append(linePrice);
        sb.append(", posName=").append(posName);
        sb.append(", posPrice=").append(posPrice);
        sb.append(", benfitPrice=").append(benfitPrice);
        sb.append(", bookTip=").append(bookTip);
        sb.append(", passengerTip=").append(passengerTip);
        sb.append(", peakUpPrice=").append(peakUpPrice);
        sb.append(", nightUpPrice=").append(nightUpPrice);
        sb.append(", farUpPrice=").append(farUpPrice);
        sb.append(", otherUpPrice=").append(otherUpPrice);
        sb.append(", payState=").append(payState);
        sb.append(", payTime=").append(payTime);
        sb.append(", orderMatchTime=").append(orderMatchTime);
        sb.append(", invoiceStatus=").append(invoiceStatus);
        sb.append(", beginBeyondOperate=").append(beginBeyondOperate);
        sb.append(", endBeyondOperate=").append(endBeyondOperate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}