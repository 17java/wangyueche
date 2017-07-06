package com.wangyueche.service;

import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInfoVo;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * Created by lyq
 */
public interface VehicleService {

    VehicleInfoVo selectVehicle(Integer address, String companyId, String vehicleNo);

    int count(Integer address, String companyId, String vehicleNo, Integer state);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String vehicleNo, Integer state);
}
