package com.wangyueche.service.statistics;

/**
 * Created by gaojl on 2017/4/27 16:58
 *
 * @author gaojl
 */
public interface OrderStatService {
    /**
     * echart统计信息
     * 统计分析
     * @return
     */
    String echartStatInfo(String companyId, String startDate, String endDate);

    String listIndexInfo();
}
