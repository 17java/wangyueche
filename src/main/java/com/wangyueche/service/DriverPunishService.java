package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 驾驶员处罚信息service
 * @author lyq
 */
public interface DriverPunishService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
