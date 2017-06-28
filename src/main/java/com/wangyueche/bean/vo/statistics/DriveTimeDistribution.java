package com.wangyueche.bean.vo.statistics;

import java.io.Serializable;

/**
 * Created by gaojl on 2017/5/2 20:56
 * 用车时间分布
 * @author gaojl
 */
public class DriveTimeDistribution implements Serializable{

    private static final long serialVersionUID = -3096385969053767383L;

    //private String companyId;
    //private String companyName;
    //时间段内的车辆数
    private Integer vehicleAmount;

    public Integer getVehicleAmount() {
        return vehicleAmount;
    }

    public void setVehicleAmount(Integer vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
    }
}
