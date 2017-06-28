package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.CompanyPay;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:15
 *
 * @author gaojl
 */
public class CompanyPayVo implements Serializable{
    private static final long serialVersionUID = 1801782095762445768L;

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

    private String companyName;

    public CompanyPayVo() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyPayVo(CompanyPay companyPay) {
        this.id = companyPay.getId();
        this.companyId = companyPay.getCompanyId();
        this.payName = companyPay.getPayName();
        this.payId = companyPay.getPayId();
        this.payType = companyPay.getPayType();
        this.payScope = companyPay.getPayScope();
        this.prepareBank = companyPay.getPrepareBank();
        this.countDate = companyPay.getCountDate();
        this.state = companyPay.getState();
        this.flag = companyPay.getFlag();
        this.updateTime = companyPay.getUpdateTime();
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

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayScope() {
        return payScope;
    }

    public void setPayScope(String payScope) {
        this.payScope = payScope;
    }

    public String getPrepareBank() {
        return prepareBank;
    }

    public void setPrepareBank(String prepareBank) {
        this.prepareBank = prepareBank;
    }

    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate;
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
}
