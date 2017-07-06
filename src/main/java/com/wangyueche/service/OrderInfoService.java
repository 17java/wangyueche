package com.wangyueche.service;

import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * 订单信息service
 *
 * @author lyq
 */
public interface OrderInfoService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String orderId, String licenseId, String vehicleNo, String driverPhone);

    List<OrderInfo> list(String vehicleNo, String licenseId, String driverPhone, String orderId);

    OrderInfo select(String vehicleNo, String licenseId, String driverPhone, String orderId);

    int count(String vehicleNo, String licenseId, String driverPhone, String orderId);
}
