package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ShareRoute implements Serializable {
    private Integer id;

    private String companyId;

    private Integer address;

    private String routeId;

    private String driverName;

    private String driverPhone;

    private String licenseId;

    private String vehicleNo;

    private String departure;

    private Double depLongitude;

    private Double depLatitude;

    private String destination;

    private Double destLongitude;

    private Double destLatitude;

    private Integer encrypt;

    private Long routeCreateTime;

    private BigDecimal routeMile;

    private String routeNote;

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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
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

    public Long getRouteCreateTime() {
        return routeCreateTime;
    }

    public void setRouteCreateTime(Long routeCreateTime) {
        this.routeCreateTime = routeCreateTime;
    }

    public BigDecimal getRouteMile() {
        return routeMile;
    }

    public void setRouteMile(BigDecimal routeMile) {
        this.routeMile = routeMile;
    }

    public String getRouteNote() {
        return routeNote;
    }

    public void setRouteNote(String routeNote) {
        this.routeNote = routeNote == null ? null : routeNote.trim();
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
        sb.append(", driverName=").append(driverName);
        sb.append(", driverPhone=").append(driverPhone);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", departure=").append(departure);
        sb.append(", depLongitude=").append(depLongitude);
        sb.append(", depLatitude=").append(depLatitude);
        sb.append(", destination=").append(destination);
        sb.append(", destLongitude=").append(destLongitude);
        sb.append(", destLatitude=").append(destLatitude);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", routeCreateTime=").append(routeCreateTime);
        sb.append(", routeMile=").append(routeMile);
        sb.append(", routeNote=").append(routeNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}