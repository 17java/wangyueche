package com.wangyueche.dao;

import com.wangyueche.bean.entity.PassengerComplaint;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 16:24
 *
 * @author gaojl
 */
public interface PassengerComplaintDao {
    /**
     * 乘客投诉信息
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param orderId
     * @param passengerPhone
     * @param startDate
     * @param endDate
     * @return
     */
    List<PassengerComplaint> listForPage(int page, int rows, Integer address, String companyId, String orderId, String passengerPhone,String startDate,String endDate);
}
