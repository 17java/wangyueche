package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface VehicleInsuranceService {
    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String vehicleNo, String insurCom);
}
