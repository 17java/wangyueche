package com.wangyueche.service.statistics;

/**
 * Created by lyq
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
