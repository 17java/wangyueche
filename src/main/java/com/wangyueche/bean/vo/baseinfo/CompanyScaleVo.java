package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.CompanyScale;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 14:19
 *
 * @author gaojl
 */
public class CompanyScaleVo implements Serializable {
    private static final long serialVersionUID = 1065317943749996900L;

    private Integer id;

    private String companyId;

    private String vehicleNum;

    private String driverNum;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public CompanyScaleVo() {
    }

    public CompanyScaleVo(CompanyScale companyScale) {
        this.id = companyScale.getId();
        this.companyId = companyScale.getCompanyId();
        this.vehicleNum = companyScale.getVehicleNum();
        this.driverNum = companyScale.getDriverNum();
        this.flag = companyScale.getFlag();
        this.updateTime = companyScale.getUpdateTime();
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

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(String driverNum) {
        this.driverNum = driverNum;
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
