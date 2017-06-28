package com.wangyueche.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class VehicleInsurance implements Serializable {
    private Integer id;

    private String companyId;

    private String vehicleNo;

    private String insurCom;

    private String insurNum;

    private String insurType;

    private BigDecimal insurCount;

    private Integer insurEff;

    private Integer insurExp;

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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public String getInsurCom() {
        return insurCom;
    }

    public void setInsurCom(String insurCom) {
        this.insurCom = insurCom == null ? null : insurCom.trim();
    }

    public String getInsurNum() {
        return insurNum;
    }

    public void setInsurNum(String insurNum) {
        this.insurNum = insurNum == null ? null : insurNum.trim();
    }

    public String getInsurType() {
        return insurType;
    }

    public void setInsurType(String insurType) {
        this.insurType = insurType == null ? null : insurType.trim();
    }

    public BigDecimal getInsurCount() {
        return insurCount;
    }

    public void setInsurCount(BigDecimal insurCount) {
        this.insurCount = insurCount;
    }

    public Integer getInsurEff() {
        return insurEff;
    }

    public void setInsurEff(Integer insurEff) {
        this.insurEff = insurEff;
    }

    public Integer getInsurExp() {
        return insurExp;
    }

    public void setInsurExp(Integer insurExp) {
        this.insurExp = insurExp;
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
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", insurCom=").append(insurCom);
        sb.append(", insurNum=").append(insurNum);
        sb.append(", insurType=").append(insurType);
        sb.append(", insurCount=").append(insurCount);
        sb.append(", insurEff=").append(insurEff);
        sb.append(", insurExp=").append(insurExp);
        sb.append(", flag=").append(flag);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}