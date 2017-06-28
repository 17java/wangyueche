package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInfoVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleService;
import com.wangyueche.dao.VehicleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Gavin on 2017/4/12.
 */
@Service
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    private VehicleDao vehicleDao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public VehicleInfoVo selectVehicle(Integer address, String companyId, String vehicleNo) {
        VehicleInfo info = vehicleDao.selectVehicle(address, companyId, vehicleNo);
        if (info != null) {
            Map<String, String> map = infoService.idWithName();
            VehicleInfoVo vo = new VehicleInfoVo(info);
            vo.setCompanyName(map.get(info.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int pageCurrent, int pageSize, Integer address, String companyId,String vehicleNo, Integer state) {
        List<VehicleInfo> list = vehicleDao.listForPage(pageCurrent, pageSize, address, companyId,vehicleNo,state);
        List<VehicleInfoVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (VehicleInfo info : list) {
                VehicleInfoVo vo = new VehicleInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<VehicleInfo> pageInfo = new PageInfo<>(list);

        EasyUIResult easyUIResult = new EasyUIResult();
        easyUIResult.setTotal(pageInfo.getTotal());
        easyUIResult.setRows(voList);
        return easyUIResult;
    }
}
