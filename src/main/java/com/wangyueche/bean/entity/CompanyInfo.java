package com.wangyueche.bean.entity;

import java.io.Serializable;

public class CompanyInfo implements Serializable {
    private Integer id;

    private String companyId;

    private String companyName;

    private String identifier;

    private Integer address;

    private String businessScope;

    private String contactAddress;

    private String economicType;

    private String regCapital;

    private String legalName;

    private String legalId;

    private String legalPhone;

    private String legalPhoto;

    private Integer state;

    private Integer flag;

    private Long updateTime;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType == null ? null : economicType.trim();
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId == null ? null : legalId.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getLegalPhoto() {
        return legalPhoto;
    }

    public void setLegalPhoto(String legalPhoto) {
        this.legalPhoto = legalPhoto == null ? null : legalPhoto.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", identifier=").append(identifier);
        sb.append(", address=").append(address);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", economicType=").append(economicType);
        sb.append(", regCapital=").append(regCapital);
        sb.append(", legalName=").append(legalName);
        sb.append(", legalId=").append(legalId);
        sb.append(", legalPhone=").append(legalPhone);
        sb.append(", legalPhoto=").append(legalPhoto);
        sb.append(", state=").append(state);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}