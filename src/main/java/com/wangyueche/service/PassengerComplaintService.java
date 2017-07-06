package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 乘客投诉信息service
 *
 * @author lyq
 */
public interface PassengerComplaintService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String orderId, String passengerPhone, String startDate, String endDate);
}
