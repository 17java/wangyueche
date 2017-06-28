package com.wangyueche.bean.entity;

import java.io.Serializable;

public class DriverPunish implements Serializable {
    private Integer id;

    private String companyId;

    private String licenseId;

    private Long punishTime;

    private String punishReason;

    private String punishResult;

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

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId == null ? null : licenseId.trim();
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
        this.punishReason = punishReason == null ? null : punishReason.trim();
    }

    public String getPunishResult() {
        return punishResult;
    }

    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult == null ? null : punishResult.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", licenseId=").append(licenseId);
        sb.append(", punishTime=").append(punishTime);
        sb.append(", punishReason=").append(punishReason);
        sb.append(", punishResult=").append(punishResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}