package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/17 13:16
 * 企业营运数据service
 *
 * @author gaojl
 */
public interface OperateDepartArriveService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String orderId, String driverName, String licenseId, String vehicleNo);

}
