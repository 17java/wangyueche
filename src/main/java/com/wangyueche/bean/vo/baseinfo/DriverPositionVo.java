package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.DriverPosition;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/4/18 15:01
 *
 * @author gaojl
 */
public class DriverPositionVo implements Serializable {

    private static final long serialVersionUID = -5524562478051665159L;

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

    private String companyName;

    public DriverPositionVo(DriverPosition driverPosition) {
        this.id = driverPosition.getId();
        this.companyId = driverPosition.getCompanyId();
        this.licenseId = driverPosition.getLicenseId();
        this.driverRegionCode = driverPosition.getDriverRegionCode();
        this.vehicleNo = driverPosition.getVehicleNo();
        this.positionTime = driverPosition.getPositionTime();
        this.longitude = driverPosition.getLongitude();
        this.latitude = driverPosition.getLatitude();
        this.encrypt = driverPosition.getEncrypt();
        this.direction = driverPosition.getDirection();
        this.elevation = driverPosition.getElevation();
        this.speed = driverPosition.getSpeed();
        this.bizStatus = driverPosition.getBizStatus();
        this.orderId = driverPosition.getOrderId();
    }

    public DriverPositionVo() {
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

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
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
        this.vehicleNo = vehicleNo;
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
        this.orderId = orderId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
