package com.wangyueche.bean.vo.share;

import com.wangyueche.bean.entity.SharePay;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/5/16 12:02 .
 */
public class SharePayVo implements Serializable {
    private static final long serialVersionUID = -5674154701839164315L;

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

    private String companyName;

    public SharePayVo() {
    }

    public SharePayVo(SharePay pay) {
        this.id = pay.getId();
        this.companyId = pay.getCompanyId();
        this.address = pay.getAddress();
        this.routeId = pay.getRouteId();
        this.orderId = pay.getOrderId();
        this.driverPhone = pay.getDriverPhone();
        this.licenseId = pay.getLicenseId();
        this.vehicleNo = pay.getVehicleNo();
        this.fareType = pay.getFareType();
        this.bookDepartTime = pay.getBookDepartTime();
        this.departTime = pay.getDepartTime();
        this.departure = pay.getDeparture();
        this.depLongitude = pay.getDepLongitude();
        this.depLatitude = pay.getDepLatitude();
        this.destTime = pay.getDestTime();
        this.destination = pay.getDestination();
        this.destLongitude = pay.getDestLongitude();
        this.destLatitude = pay.getDestLatitude();
        this.encrypt = pay.getEncrypt();
        this.driveMile = pay.getDriveMile();
        this.driveTime = pay.getDriveTime();
        this.facePrice = pay.getFacePrice();
        this.price = pay.getPrice();
        this.cashPrice = pay.getCashPrice();
        this.lineName = pay.getLineName();
        this.linePrice = pay.getLinePrice();
        this.benfitPrice = pay.getBenfitPrice();
        this.shareFueFee = pay.getShareFueFee();
        this.shareHighwayToll = pay.getShareHighwayToll();
        this.passengerTip = pay.getPassengerTip();
        this.shareOther = pay.getShareOther();
        this.payState = pay.getPayState();
        this.passengerNum = pay.getPassengerNum();
        this.payTime = pay.getPayTime();
        this.orderMatchTime = pay.getOrderMatchTime();
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

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
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
        this.departure = departure;
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
        this.destination = destination;
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
        this.lineName = lineName;
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
        this.payState = payState;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
