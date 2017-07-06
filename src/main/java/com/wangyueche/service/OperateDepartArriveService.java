package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 企业营运数据service
 * @author lyq
 */
public interface OperateDepartArriveService {

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String orderId, String driverName, String licenseId, String vehicleNo);

}
