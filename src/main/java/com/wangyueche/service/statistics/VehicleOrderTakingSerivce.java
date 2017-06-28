package com.wangyueche.service.statistics;

/**
 * Created by gaojl on 2017/5/11 9:14 .
 *
 * 车辆接单量分布
 */
public interface VehicleOrderTakingSerivce {
    /**
     *
     * @param companyId
     * @param startDate
     * @param endDate
     * @param type  bar:柱状图  pie:饼状图
     * @return
     */
    String listBarStat(String companyId, String startDate, String endDate, String type);


}
