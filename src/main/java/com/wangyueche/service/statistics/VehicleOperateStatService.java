package com.wangyueche.service.statistics;

/**
 * Created by lyq on 2017/5/8 15:25 .
 * 车辆运行信息统计
 */
public interface VehicleOperateStatService {
    String listStat(String companyId, String startDate, String endDate);

    /**
     * 首页车辆信息
     * @return
     */
    String listIndexInfo();
}
