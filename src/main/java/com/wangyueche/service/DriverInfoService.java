package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface DriverInfoService {

    DriverInfoVo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone);

    EasyUIResult listForPage(Pager pager, Integer address,String companyId, String licenseId,String driverName,Integer state);
}
