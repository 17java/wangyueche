package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * 驾驶员信誉信息
 * @author lyq
 */
public interface DriverReputationService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
