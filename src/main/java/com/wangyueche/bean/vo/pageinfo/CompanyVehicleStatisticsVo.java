package com.wangyueche.bean.vo.pageinfo;

import java.io.Serializable;

/**
 * Created by gaoshiwei on 2017/4/21.
 */
public class CompanyVehicleStatisticsVo implements Serializable {

    private static final long serialVersionUID = -3817046025708789149L;

    /**
     * 平台公司车辆总数量
     */
    private long totalCompanyVehicle;

    /**
     * 平台公司运营车辆总数量
     */
    private long totalCompanySuccessVehicle;

    /**
     * 平台公司车辆出车率
     */
    private double totalCompanyScaleVehileRate;

    public long getTotalCompanyVehicle() {
        return totalCompanyVehicle;
    }

    public void setTotalCompanyVehicle(long totalCompanyVehicle) {
        this.totalCompanyVehicle = totalCompanyVehicle;
    }

    public long getTotalCompanySuccessVehicle() {
        return totalCompanySuccessVehicle;
    }

    public void setTotalCompanySuccessVehicle(long totalCompanySuccessVehicle) {
        this.totalCompanySuccessVehicle = totalCompanySuccessVehicle;
    }

    public double getTotalCompanyScaleVehileRate() {
        return totalCompanyScaleVehileRate;
    }

    public void setTotalCompanyScaleVehileRate(double totalCompanyScaleVehileRate) {
        this.totalCompanyScaleVehileRate = totalCompanyScaleVehileRate;
    }
}
