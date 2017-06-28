package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/5/15 11:57 .
 * 合乘行程信息
 */
public interface ShareRouteService {
    EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo);
}
