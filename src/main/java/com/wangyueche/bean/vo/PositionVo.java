package com.wangyueche.bean.vo;

/**
 * Created by zhangfei on 2017/4/24.
 */
public class PositionVo {

    private String  vehicleNo;

    private SpotVo position;


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public SpotVo getPosition() {
        return position;
    }

    public void setPosition(SpotVo position) {
        this.position = position;
    }
}
