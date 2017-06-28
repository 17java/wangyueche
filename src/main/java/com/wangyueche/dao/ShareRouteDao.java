package com.wangyueche.dao;

import com.wangyueche.bean.entity.ShareRoute;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:27 .
 * 合乘驾驶员行程信息
 */
public interface ShareRouteDao {
    List<ShareRoute> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo);
}
