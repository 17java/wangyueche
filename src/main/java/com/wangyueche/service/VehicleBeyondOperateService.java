package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 *  运营监管-超区域经营
 */
public interface VehicleBeyondOperateService {
    EasyUIResult list(Pager pager, String vehicleNo, String startDate, String endDate);
}
