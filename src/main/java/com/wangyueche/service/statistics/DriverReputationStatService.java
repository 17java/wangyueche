package com.wangyueche.service.statistics;

/**
 * Created by gaojl on 2017/5/9 5:15.
 * 驾驶员信誉统计
 */
public interface DriverReputationStatService {
    String listStat(String companyId, String startDate, String endDate);
}
