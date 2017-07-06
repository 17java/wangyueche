package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * 特殊车辆查找
 * Created by lyq
 */
public interface VehicleSpecialService {

    EasyUIResult list(Pager pager, String companyId, String vehicleNo, String orderId, String depPosition, String destPosition, String startDate, String endDate);

}
