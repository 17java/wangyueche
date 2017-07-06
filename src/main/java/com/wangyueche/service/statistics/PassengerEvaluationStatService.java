package com.wangyueche.service.statistics;

/**
 * 乘客评价统计
 * Created by lyq
 */
public interface PassengerEvaluationStatService {
    String listStat(String companyId, String startDate, String endDate);
}
