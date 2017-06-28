package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.DriverPunish;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 15:07
 *
 * @author gaojl
 */
public class DriverPunishVo implements Serializable {

    private static final long serialVersionUID = -3756413753044493799L;

    private Integer id;

    private String companyId;

    private String licenseId;

    private Long punishTime;

    private String punishReason;

    private String punishResult;

    private String companyName;

    public DriverPunishVo(DriverPunish driverPunish) {
        this.id = driverPunish.getId();
        this.companyId = driverPunish.getCompanyId();
        this.licenseId = driverPunish.getLicenseId();
        this.punishTime = driverPunish.getPunishTime();
        this.punishReason = driverPunish.getPunishReason();
        this.punishResult = driverPunish.getPunishResult();
    }

    public DriverPunishVo() {
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

    public Long getPunishTime() {
        return punishTime;
    }

    public void setPunishTime(Long punishTime) {
        this.punishTime = punishTime;
    }

    public String getPunishReason() {
        return punishReason;
    }

    public void setPunishReason(String punishReason) {
        this.punishReason = punishReason;
    }

    public String getPunishResult() {
        return punishResult;
    }

    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
