package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/17 13:25
 * 驾驶员处罚信息service
 *
 * @author gaojl
 */
public interface DriverPunishService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
