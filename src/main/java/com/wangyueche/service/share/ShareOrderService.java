package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 * 合乘订单信息
 */
public interface ShareOrderService {
    EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String orderId);
}
