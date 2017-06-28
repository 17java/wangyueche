package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * 特殊车辆查找
 * Created by gaojl on 2017/5/10 10:41 .
 */
public interface VehicleSpecialService {
    EasyUIResult list(Integer page, Integer rows, String companyId, String vehicleNo, String orderId, String depPosition, String destPosition,String startDate,String endDate);
}
