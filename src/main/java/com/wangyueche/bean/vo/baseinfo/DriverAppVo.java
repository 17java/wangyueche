package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.DriverApp;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:42
 *
 * @author gaojl
 */
public class DriverAppVo implements Serializable {
    private static final long serialVersionUID = 1496981868396818202L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String licenseId;

    private String driverPhone;

    private Integer netType;

    private String appVersion;

    private Integer mapType;

    private Integer state;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public DriverAppVo(DriverApp driverApp) {
        this.id = driverApp.getId();
        this.companyId = driverApp.getCompanyId();
        this.address = driverApp.getAddress();
        this.licenseId = driverApp.getLicenseId();
        this.driverPhone = driverApp.getDriverPhone();
        this.netType = driverApp.getNetType();
        this.appVersion = driverApp.getAppVersion();
        this.mapType = driverApp.getMapType();
        this.state = driverApp.getState();
        this.flag = driverApp.getFlag();
        this.updateTime = driverApp.getUpdateTime();
    }

    public DriverAppVo() {
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

    public Integer getNetType() {
        return netType;
    }

    public void setNetType(Integer netType) {
        this.netType = netType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Integer getMapType() {
        return mapType;
    }

    public void setMapType(Integer mapType) {
        this.mapType = mapType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
