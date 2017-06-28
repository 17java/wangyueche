package com.wangyueche.bean.vo.baseinfo;

import com.wangyueche.bean.entity.VehicleTotalMile;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/4/18 15:55
 *
 * @author gaojl
 */
public class VehicleTotalMileVo implements Serializable {
    private static final long serialVersionUID = 519563062590902550L;

    private Integer id;

    private String companyId;

    private Integer address;

    private String vehicleNo;

    private String totalMile;

    private Integer flag;

    private Long updateTime;

    private String companyName;

    public VehicleTotalMileVo(VehicleTotalMile mile) {
        this.id = mile.getId();
        this.companyId = mile.getCompanyId();
        this.address = mile.getAddress();
        this.vehicleNo = mile.getVehicleNo();
        this.totalMile = mile.getTotalMile();
        this.flag = mile.getFlag();
        this.updateTime = mile.getUpdateTime();
    }

    public VehicleTotalMileVo() {
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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getTotalMile() {
        return totalMile;
    }

    public void setTotalMile(String totalMile) {
        this.totalMile = totalMile;
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
