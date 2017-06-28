package com.wangyueche.dao;

import com.wangyueche.bean.entity.PassengerInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 15:46
 *
 * @author gaojl
 */
public interface PassengerInfoDao {
    /**
     * 乘客信息
     * @param page
     * @param rows
     * @param companyId
     * @param passengerName
     * @param passengerPhone
     * @return
     */
    List<PassengerInfo> listForPage(int page, int rows, String companyId, String passengerName, String passengerPhone);
}
