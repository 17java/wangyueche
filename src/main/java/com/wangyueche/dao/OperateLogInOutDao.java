package com.wangyueche.dao;

import com.wangyueche.bean.entity.OperateLogInOut;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 15:19
 *
 * @author gaojl
 */
public interface OperateLogInOutDao {
    /**
     * 车辆运营上下线
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param startDate
     * @param endDate
     * @param licenseId
     * @param vehicleNo
     * @return
     */
    List<OperateLogInOut> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo);
}
