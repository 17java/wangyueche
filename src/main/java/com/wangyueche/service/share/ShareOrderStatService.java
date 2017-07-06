package com.wangyueche.service.share;

/**
 * Created by lyq
 * 合乘订单统计信息service
 */
public interface ShareOrderStatService {
    String listStat(String companyId, String startDate, String endDate);
}