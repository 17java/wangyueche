package com.wangyueche.bean.vo.share;

import com.wangyueche.bean.entity.ShareRoute;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/5/16 12:02 .
 */
public class ShareRouteVo implements Serializable{
    private static final long serialVersionUID = -6778265517074523897L;

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

    private String companyName;

    public ShareRouteVo() {
    }

    public ShareRouteVo(ShareRoute route) {
        this.id = route.getId();
        this.companyId = route.getCompanyId();
        this.address = route.getAddress();
        this.routeId = route.getRouteId();
        this.driverName = route.getDriverName();
        this.driverPhone = route.getDriverPhone();
        this.licenseId = route.getLicenseId();
        this.vehicleNo = route.getVehicleNo();
        this.departure = route.getDeparture();
        this.depLongitude = route.getDepLongitude();
        this.depLatitude = route.getDepLatitude();
        this.destination = route.getDestination();
        this.destLongitude = route.getDestLongitude();
        this.destLatitude = route.getDestLatitude();
        this.encrypt = route.getEncrypt();
        this.routeCreateTime = route.getRouteCreateTime();
        this.routeMile = route.getRouteMile();
        this.routeNote = route.getRouteNote();
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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
        this.routeNote = routeNote;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
