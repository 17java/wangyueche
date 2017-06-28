package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/17 13:23
 * 乘客评价信息
 *
 * @author gaojl
 */
public interface PassengerEvaluationService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone, String startDate, String endDate);
}
