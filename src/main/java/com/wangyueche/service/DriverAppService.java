package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverApp;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverAppVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface DriverAppService {

    DriverAppVo selectDriverApp(String companyId, String licenseId, String driverPhone);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String driverPhone, Integer state);
}
