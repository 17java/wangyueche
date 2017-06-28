package com.wangyueche.service;

import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.vo.EasyUIResult;

import java.util.List;

/**
 * Created by gaojl on 2017/4/17 13:25
 * 驾驶员信誉信息
 *
 * @author gaojl
 */
public interface DriverReputationService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
