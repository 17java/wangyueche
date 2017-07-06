package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 * 合乘行程信息
 */
public interface ShareRouteService {
    EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo);
}
