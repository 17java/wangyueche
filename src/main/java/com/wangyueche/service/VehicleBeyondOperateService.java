package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/5/10 9:21 .
 *  运营监管-超区域经营
 */
public interface VehicleBeyondOperateService {
    EasyUIResult list(Integer page, Integer rows, String vehicleNo, String startDate, String endDate);
}
