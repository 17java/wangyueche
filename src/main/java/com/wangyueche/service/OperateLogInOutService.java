package com.wangyueche.service;

import com.wangyueche.bean.entity.OperateLogInOut;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * 车辆运营上下线service
 *
 * @author lyq
 */
public interface OperateLogInOutService {

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo);
}
