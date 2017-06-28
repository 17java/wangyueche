package com.wangyueche.dao;

import com.wangyueche.bean.entity.SharePay;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:34 .
 * 合乘支付信息
 */
public interface SharePayDao {
    List<SharePay> findListByCriteria(Integer page, Integer rows, String companyId,String routeId, String orderId, String driverPhone, String vehicleNo);
}
