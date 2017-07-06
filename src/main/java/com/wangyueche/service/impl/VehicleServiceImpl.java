package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInfoVo;
import com.wangyueche.mapper.FenceMapper;
import com.wangyueche.mapper.VehicleInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleInfoMapper vehicleInfoMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public VehicleInfoVo selectVehicle(Integer address, String companyId, String vehicleNo) {
        ArgGen argGen = new ArgGen();
        argGen.addPositive("address", address)
                .addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo", vehicleNo);
        Pager pager = new Pager();
        pager.max();
        pager.setSorts(VehicleInfoMapper.ORDERBY);

        VehicleInfo info = null;
        List<VehicleInfo> resultData = vehicleInfoMapper.select(pager, argGen.getArgs());
        if (resultData.size() > 0) {
            info = resultData.get(0);
        }

        if (info != null) {
            Map<String, String> map = infoService.idWithName();
            VehicleInfoVo vo = new VehicleInfoVo(info);
            vo.setCompanyName(map.get(info.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public int count(Integer address, String companyId, String vehicleNo, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addPositive("address", address)
                .addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addPositive("state", state);
        return vehicleInfoMapper.count(argGen.getArgs());
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId,String vehicleNo, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addPositive("address", address)
                .addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addPositive("state", state);
        pager.setSorts(VehicleInfoMapper.ORDERBY);
        List<VehicleInfo> list = vehicleInfoMapper.select(pager, argGen.getArgs());
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
