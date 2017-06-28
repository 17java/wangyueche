package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverEducate;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverEducateVo;

/**
 * Created by gaojl on 2017/4/13 6:45
 *
 * @author gaojl
 */

public interface DriverEducateService {
    DriverEducateVo selectDriverEducate(String companyId, String licenseId, String driverPhone);

    EasyUIResult listForPage(int page,int pageSize,Integer address, String companyId, String licenseId, String courseName,String driverPhone);
}
