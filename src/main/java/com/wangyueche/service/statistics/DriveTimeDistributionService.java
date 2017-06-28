package com.wangyueche.service.statistics;

/**
 * Created by gaojl on 2017/5/8 17:41 .
 * 用车时间段分布
 */
public interface DriveTimeDistributionService {
    String listStat(String companyId, String startDate, String endDate);
}
