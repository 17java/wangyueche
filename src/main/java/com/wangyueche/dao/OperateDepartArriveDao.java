package com.wangyueche.dao;

import java.util.List;

import com.wangyueche.bean.entity.OperateDepartArrive;

/**
 * Created by gaojl on 2017/4/14 13:19
 *
 * @author gaojl
 */
public interface OperateDepartArriveDao {
    /**
     * 运营监管-营运数据-企业营运数据
     *
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param orderId
     * @param driverName
     * @param licenseId
     * @param vehicleNo
     * @return
     */
    List<OperateDepartArrive> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String orderId, String driverName, String licenseId, String vehicleNo);

    
    OperateDepartArrive selectByOrderId(String orderId);


}
