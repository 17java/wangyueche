package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/13 17:41
 *
 * @author gaojl
 */
public interface VehicleInsuranceService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String vehicleNo, String insurCom);
}
