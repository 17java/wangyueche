package com.wangyueche.dao;

import com.wangyueche.bean.entity.OrderInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 10:10
 *
 * @author gaojl
 */
public interface OrderInfoDao {
    /**
     * 运营监管-营运信息-订单业务信息
     *
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param startDate
     * @param endDate
     * @param orderId
     * @param licenseId
     * @param vehicleNo
     * @param driverPhone
     * @return
     */
    List<OrderInfo> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String orderId, String licenseId, String vehicleNo, String driverPhone);

    List<OrderInfo> selectByVehicleNo(String vehicleNo);

    List<OrderInfo> selectByLicenseId(String licenseId);

    List<OrderInfo> selectByDriverPhone(String driverPhone);

    OrderInfo selectByOrderId(String orderId);

    /**
     * 订单总数量
     * @return
     */
    long getTotalOrder();

    /**
     * 成功订单总数量
     */
    long getTotalSuccessOrder();

    /**
     * 平台公司订单总数量
     * @return
     */
    long getCompanyTotalOrder(String companyId);

    /**
     * 平台公司成功订单总数量
     */
    long getCompanyTotalSuccessOrder(String companyId);
}
