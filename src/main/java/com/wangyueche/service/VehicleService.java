package com.wangyueche.service;

import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInfoVo;

import java.util.List;

/**
 * Created by Gavin on 2017/4/12.
 */
public interface VehicleService {

    VehicleInfoVo selectVehicle(Integer address, String companyId, String vehicleNo);

    EasyUIResult listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String vehicleNo, Integer state);
}
