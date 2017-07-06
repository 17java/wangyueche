package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 乘客信息service
 * @author lyq
 */
public interface PassengerInfoService {
    EasyUIResult listForPage(Pager pager, String companyId, String passengerName, String passengerPhone);
}
