package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverEducate;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 14:16
 *
 * @author gaojl
 */
public interface DriverEducateDao {
    DriverEducate selectDriverEducate(String companyId, String licenseId, String driverPhone);

    List<DriverEducate> listForPage(int page,int pageSize,Integer address, String companyId, String licenseId, String courseName,String driverPhone);
}
