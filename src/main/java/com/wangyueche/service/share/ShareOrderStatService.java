package com.wangyueche.service.share;

/**
 * Created by gaojl on 2017/5/16 10:56 .
 * 合乘订单统计信息service
 */
public interface ShareOrderStatService {
    String listStat(String companyId, String startDate, String endDate);
}