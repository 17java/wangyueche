package com.wangyueche.service.statistics;

/**
 * Created by gaojl on 2017/4/30 11:43
 * 平台市场占有率service
 *
 * @author gaojl
 */
public interface CompanyMarketShareService {
    String marketShareStat(String companyId, String startDate, String endDate);
}
