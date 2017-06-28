package com.wangyueche.bean.entity;

import java.io.Serializable;

public class DriverReputation implements Serializable {
    private Integer id;

    private String companyId;

    private String licenseId;

    private Integer level;

    private Integer testDate;

    private String testDepartment;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTestDate() {
        return testDate;
    }

    public void setTestDate(Integer testDate) {
        this.testDate = testDate;
    }

    public String getTestDepartment() {
        return testDepartment;
    }

    public void setTestDepartment(String testDepartment) {
        this.testDepartment = testDepartment == null ? null : testDepartment.trim();
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
        sb.append(", level=").append(level);
        sb.append(", testDate=").append(testDate);
        sb.append(", testDepartment=").append(testDepartment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}