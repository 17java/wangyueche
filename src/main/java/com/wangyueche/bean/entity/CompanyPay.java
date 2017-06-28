package com.wangyueche.bean.entity;

import java.io.Serializable;

public class CompanyPay implements Serializable {
    private Integer id;

    private String companyId;

    private String payName;

    private String payId;

    private String payType;

    private String payScope;

    private String prepareBank;

    private String countDate;

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

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayScope() {
        return payScope;
    }

    public void setPayScope(String payScope) {
        this.payScope = payScope == null ? null : payScope.trim();
    }

    public String getPrepareBank() {
        return prepareBank;
    }

    public void setPrepareBank(String prepareBank) {
        this.prepareBank = prepareBank == null ? null : prepareBank.trim();
    }

    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate == null ? null : countDate.trim();
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
        sb.append(", payName=").append(payName);
        sb.append(", payId=").append(payId);
        sb.append(", payType=").append(payType);
        sb.append(", payScope=").append(payScope);
        sb.append(", prepareBank=").append(prepareBank);
        sb.append(", countDate=").append(countDate);
        sb.append(", state=").append(state);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}