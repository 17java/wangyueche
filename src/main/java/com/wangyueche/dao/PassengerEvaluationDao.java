package com.wangyueche.dao;

import com.wangyueche.bean.entity.PassengerEvaluation;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 16:16
 *
 * @author gaojl
 */
public interface PassengerEvaluationDao {
    /**
     * 乘客评价信息
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param orderId
     * @param vehicleNo
     * @param licenseId
     * @param driverPhone
     * @param startDate
     * @param endDate
     * @return
     */
    List<PassengerEvaluation> listForPage(int page, int rows, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone,String startDate,String endDate);
}
