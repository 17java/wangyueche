package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverEducate;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverEducateVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */

public interface DriverEducateService {
    DriverEducateVo selectDriverEducate(String companyId, String licenseId, String driverPhone);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String courseName,String driverPhone);
}
