package com.wangyueche.service.statistics;

/**
 * Created by lyq
 * 用车时间段分布
 */
public interface DriveTimeDistributionService {
    String listStat(String companyId, String startDate, String endDate);
}
