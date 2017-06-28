package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.OrderInfo;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 16:09
 *
 * @author gaojl
 */
public class OrderInfoVo implements Serializable {
    private static final long serialVersionUID = 7710664316289657878L;

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

    private String companyName;

    private String regionName;

    public OrderInfoVo(OrderInfo orderInfo) {
        this.id = orderInfo.getId();
        this.companyId = orderInfo.getCompanyId();
        this.address = orderInfo.getAddress();
        this.orderId = orderInfo.getOrderId();
        this.departTime = orderInfo.getDepartTime();
        this.orderTime = orderInfo.getOrderTime();
        this.passengerNote = orderInfo.getPassengerNote();
        this.departure = orderInfo.getDeparture();
        this.depLongitude = orderInfo.getDepLongitude();
        this.depLatitude = orderInfo.getDepLatitude();
        this.destination = orderInfo.getDestination();
        this.destLongitude = orderInfo.getDestLongitude();
        this.destLatitude = orderInfo.getDestLatitude();
        this.encrypt = orderInfo.getEncrypt();
        this.fareType = orderInfo.getFareType();
        this.longitude = orderInfo.getLongitude();
        this.latitude = orderInfo.getLatitude();
        this.licenseId = orderInfo.getLicenseId();
        this.driverPhone = orderInfo.getDriverPhone();
        this.vehicleNo = orderInfo.getVehicleNo();
        this.distributeTime = orderInfo.getDistributeTime();
        this.cancelTime = orderInfo.getCancelTime();
        this.operator = orderInfo.getOperator();
        this.cancelTypeCode = orderInfo.getCancelTypeCode();
        this.cancelReason = orderInfo.getCancelReason();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public OrderInfoVo() {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
        this.passengerNote = passengerNote;
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

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
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
        this.licenseId = licenseId;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
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
        this.operator = operator;
    }

    public String getCancelTypeCode() {
        return cancelTypeCode;
    }

    public void setCancelTypeCode(String cancelTypeCode) {
        this.cancelTypeCode = cancelTypeCode;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
