package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverApp;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 14:15
 *
 * @author gaojl
 */
public interface DriverAppDao {
    /**
     * 综合信息——驾驶员信息——移动终端信息
     * @param companyId
     * @param licenseId
     * @param driverPhone
     * @return
     */
    DriverApp selectDriverApp(String companyId, String licenseId, String driverPhone);

    /**
     * 基本信息——基础信息——驾驶员移动终端信息
     *
     * @param address     归属区划
     * @param companyId   公司标识
     * @param driverPhone 驾驶员手机号
     * @param state       状态
     * @return
     */
    List<DriverApp> listForPage(int page, int pageSize, Integer address, String companyId, String licenseId,String driverPhone, Integer state);

}
