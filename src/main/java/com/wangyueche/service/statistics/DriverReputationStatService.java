package com.wangyueche.service.statistics;

/**
 * Created by lyq
 * 驾驶员信誉统计
 */
public interface DriverReputationStatService {
    String listStat(String companyId, String startDate, String endDate);
}
