package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/17 13:24
 * 乘客投诉信息service
 *
 * @author gaojl
 */
public interface PassengerComplaintService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String orderId, String passengerPhone, String startDate, String endDate);
}
