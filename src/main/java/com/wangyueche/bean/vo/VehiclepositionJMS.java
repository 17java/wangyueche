package com.wangyueche.bean.vo;

import java.io.Serializable;


/**
 * Created by lyq on 2017/4/19.
 * 车辆定位信息
 */
public class VehiclepositionJMS implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//公司标识
    private String companyId;
    //车辆号牌
    private String vehicleNo;
    //行政区划代码
    private Integer vehicleRegionCode;
    //定位时间
    private Long positionTime;
    //经度
    private double longitude;
    //纬度
    private double latitude;
    //瞬时速度
    private Integer speed;
    //方向角
    private Integer direction;
    //海拔高度
    private Integer elevation;
    //行驶里程
    private Integer mileage;
    //坐标加密标识
    private Integer encrypt;
    //预警状态
    private Integer warnStatus;
    //车辆状态
    private Integer vehStatus;
    //营运状态
    private Integer bizStatus;
    //订单编号
    private String orderId;


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


    public Integer getVehicleRegionCode() {
        return vehicleRegionCode;
    }

    public void setVehicleRegionCode(Integer vehicleRegionCode) {
        this.vehicleRegionCode = vehicleRegionCode;
    }


    public Long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Long positionTime) {
        this.positionTime = positionTime;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }


    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }


    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }


    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }


    public Integer getWarnStatus() {
        return warnStatus;
    }

    public void setWarnStatus(Integer warnStatus) {
        this.warnStatus = warnStatus;
    }


    public Integer getVehStatus() {
        return vehStatus;
    }

    public void setVehStatus(Integer vehStatus) {
        this.vehStatus = vehStatus;
    }

    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


}
