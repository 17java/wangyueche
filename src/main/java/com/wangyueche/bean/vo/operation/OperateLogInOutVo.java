package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.OperateLogInOut;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/23 10:23
 *
 * @author gaojl
 */
public class OperateLogInOutVo implements Serializable {
    private static final long serialVersionUID = -1643765983576647674L;

    private Integer id;

    private String companyId;

    private String licenseId;

    private String vehicleNo;

    private Long loginTime;

    private Double inLongitude;

    private Double inLatitude;

    private Integer inEncrypt;

    private Long logoutTime;

    private Double outLongitude;

    private Double outLatitude;

    private Integer outEncrypt;

    private String companyName;

    public OperateLogInOutVo(OperateLogInOut logInOut) {
        this.id = logInOut.getId();
        this.companyId = logInOut.getCompanyId();
        this.licenseId = logInOut.getLicenseId();
        this.vehicleNo = logInOut.getVehicleNo();
        this.loginTime = logInOut.getLoginTime();
        this.inLongitude = logInOut.getInLongitude();
        this.inLatitude = logInOut.getInLatitude();
        this.inEncrypt = logInOut.getInEncrypt();
        this.logoutTime = logInOut.getLogoutTime();
        this.outLongitude = logInOut.getOutLongitude();
        this.outLatitude = logInOut.getOutLatitude();
        this.outEncrypt = logInOut.getOutEncrypt();
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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public Double getInLongitude() {
        return inLongitude;
    }

    public void setInLongitude(Double inLongitude) {
        this.inLongitude = inLongitude;
    }

    public Double getInLatitude() {
        return inLatitude;
    }

    public void setInLatitude(Double inLatitude) {
        this.inLatitude = inLatitude;
    }

    public Integer getInEncrypt() {
        return inEncrypt;
    }

    public void setInEncrypt(Integer inEncrypt) {
        this.inEncrypt = inEncrypt;
    }

    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Double getOutLongitude() {
        return outLongitude;
    }

    public void setOutLongitude(Double outLongitude) {
        this.outLongitude = outLongitude;
    }

    public Double getOutLatitude() {
        return outLatitude;
    }

    public void setOutLatitude(Double outLatitude) {
        this.outLatitude = outLatitude;
    }

    public Integer getOutEncrypt() {
        return outEncrypt;
    }

    public void setOutEncrypt(Integer outEncrypt) {
        this.outEncrypt = outEncrypt;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
