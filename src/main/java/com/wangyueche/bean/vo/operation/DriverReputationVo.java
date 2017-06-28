package com.wangyueche.bean.vo.operation;

import com.wangyueche.bean.entity.DriverReputation;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 15:21
 *
 * @author gaojl
 */
public class DriverReputationVo implements Serializable {

    private static final long serialVersionUID = -7113159318767050686L;

    private Integer id;

    private String companyId;

    private String licenseId;

    private Integer level;

    private Integer testDate;

    private String testDepartment;

    private String companyName;

    public DriverReputationVo(DriverReputation reputation) {
        this.id = reputation.getId();
        this.companyId = reputation.getCompanyId();
        this.licenseId = reputation.getLicenseId();
        this.level = reputation.getLevel();
        this.testDate = reputation.getTestDate();
        this.testDepartment = reputation.getTestDepartment();
    }

    public DriverReputationVo() {
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
        this.testDepartment = testDepartment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
