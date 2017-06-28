package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/17 13:22
 * 乘客信息service
 *
 * @author gaojl
 */
public interface PassengerInfoService {
    EasyUIResult listForPage(int page, int rows, String companyId, String passengerName, String passengerPhone);
}
