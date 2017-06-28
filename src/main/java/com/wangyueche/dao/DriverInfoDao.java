package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 14:13
 *
 * @author gaojl
 */
public interface DriverInfoDao {
    /**
     * 综合信息——驾驶员信息——基本信息
     * @param address 归属区划id
     * @param companyId 公司标识
     * @param licenseId 驾驶证号
     * @param driverPhone 驾驶员手机号
     * @return
     */
    DriverInfo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone);

    /**
     * 基本信息——基础信息——驾驶员信息
     * @param pageCurrent
     * @param pageSize
     * @param companyId
     * @param state
     * @return
     */
    List<DriverInfo> listForPage(int pageCurrent, int pageSize,Integer address,String companyId,String licenseId,String driverName,Integer state);

    /**
     * 通过手机号查找驾驶员信息
     * @param driverPhone
     * @return
     */
    DriverInfo selectByDriverPhone(String driverPhone);
}
