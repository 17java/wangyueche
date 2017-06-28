package com.wangyueche.service.statistics;

/**
 * 乘客评价统计
 * Created by gaojl on 2017/5/9 5:00.
 */
public interface PassengerEvaluationStatService {
    String listStat(String companyId, String startDate, String endDate);
}
