package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.CompanyPermit;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:11
 *
 * @author gaojl
 */
public class CompanyPermitVo implements Serializable {
    private static final long serialVersionUID = 4899649901453849101L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String certificate;

    private String operationArea;

    private String ownerName;

    private String organization;

    private Integer startDate;

    private Integer stopDate;

    private Integer certifyDate;

    private String state;

    private Integer flag;

    private Long updateTime;

    private String companyName;


    public CompanyPermitVo(CompanyPermit companyPermit) {
        this.id = companyPermit.getId();
        this.companyId = companyPermit.getCompanyId();
        this.address = companyPermit.getAddress();
        this.certificate = companyPermit.getCertificate();
        this.operationArea = companyPermit.getOperationArea();
        this.ownerName = companyPermit.getOwnerName();
        this.organization = companyPermit.getOrganization();
        this.startDate = companyPermit.getStartDate();
        this.stopDate = companyPermit.getStopDate();
        this.certifyDate = companyPermit.getCertifyDate();
        this.state = companyPermit.getState();
        this.flag = companyPermit.getFlag();
        this.updateTime = companyPermit.getUpdateTime();
    }

    public CompanyPermitVo() {
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

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(String operationArea) {
        this.operationArea = operationArea;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getStopDate() {
        return stopDate;
    }

    public void setStopDate(Integer stopDate) {
        this.stopDate = stopDate;
    }

    public Integer getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Integer certifyDate) {
        this.certifyDate = certifyDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
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
