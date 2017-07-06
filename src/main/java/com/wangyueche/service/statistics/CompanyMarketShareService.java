package com.wangyueche.service.statistics;

/**
 * 平台市场占有率service
 * @author lyq
 */
public interface CompanyMarketShareService {
    String marketShareStat(String companyId, String startDate, String endDate);
}
