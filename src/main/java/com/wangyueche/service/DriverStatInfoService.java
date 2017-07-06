package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverStatInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverStatInfoVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface DriverStatInfoService {

    DriverStatInfoVo selectDriverStat(String companyId, String licenseId, String driverPhone);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId,String driverPhone);
}
