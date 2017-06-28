package com.wangyueche.dao;

import com.wangyueche.bean.entity.ShareOrder;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:29 .
 * 合乘订单信息
 */
public interface ShareOrderDao {
    List<ShareOrder> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId);
}
