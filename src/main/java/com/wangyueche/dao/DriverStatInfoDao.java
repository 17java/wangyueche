package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverStatInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 14:14
 *
 * @author gaojl
 */
public interface DriverStatInfoDao {
    DriverStatInfo selectDriverStat(String companyId, String licenseId, String driverPhone);

    List<DriverStatInfo> listForPage(int page, int pageSize, Integer address, String companyId, String licenseId,String driverPhone);
}
