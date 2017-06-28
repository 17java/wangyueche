package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.VehicleInsurance;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gaojl on 2017/4/18 15:51
 *
 * @author gaojl
 */
public class VehicleInsuranceVo implements Serializable {
    private static final long serialVersionUID = -1681884179906666158L;

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

    private String companyName;

    public VehicleInsuranceVo(VehicleInsurance insurance) {
        this.id = insurance.getId();
        this.companyId = insurance.getCompanyId();
        this.vehicleNo = insurance.getVehicleNo();
        this.insurCom = insurance.getInsurCom();
        this.insurNum = insurance.getInsurNum();
        this.insurType = insurance.getInsurType();
        this.insurCount = insurance.getInsurCount();
        this.insurEff = insurance.getInsurEff();
        this.insurExp = insurance.getInsurExp();
        this.flag = insurance.getFlag();
        this.updateTime = insurance.getUpdateTime();
    }

    public VehicleInsuranceVo() {
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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getInsurCom() {
        return insurCom;
    }

    public void setInsurCom(String insurCom) {
        this.insurCom = insurCom;
    }

    public String getInsurNum() {
        return insurNum;
    }

    public void setInsurNum(String insurNum) {
        this.insurNum = insurNum;
    }

    public String getInsurType() {
        return insurType;
    }

    public void setInsurType(String insurType) {
        this.insurType = insurType;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
