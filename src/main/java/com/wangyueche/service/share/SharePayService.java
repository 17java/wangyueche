package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 * 合乘支付信息
 */
public interface SharePayService {
    EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String orderId, String driverPhone, String vehicleNo);
}
