package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 乘客评价信息
 * @author lyq
 */
public interface PassengerEvaluationService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone, String startDate, String endDate);
}
