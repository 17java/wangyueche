package com.wangyueche.service;

import com.wangyueche.bean.vo.pageinfo.OrderStatisticsVo;
import com.wangyueche.bean.vo.pageinfo.VehicleStatisticsVo;

/**
 * Created by gaoshiwei on 2017/4/21.
 */
public interface PageInfoService {

    /**
     * 首页概览-数据概览-平台订单数量统计
     * @return
     */
    OrderStatisticsVo queryCompanyOrderStatistics();

    /**
     * 首页概览-数据概览-平台车辆数量统计
     */
    VehicleStatisticsVo queryCompanyVehicleStatistics();
}
