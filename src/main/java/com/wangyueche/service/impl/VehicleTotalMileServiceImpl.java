package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.VehicleTotalMile;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleTotalMileVo;
import com.wangyueche.mapper.CompanyPayMapper;
import com.wangyueche.mapper.VehicleTotalMileMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleTotalMileService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lyq
 */
@Service
public class VehicleTotalMileServiceImpl implements VehicleTotalMileService {
    @Autowired
    private VehicleTotalMileMapper vehicleTotalMileMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String vehicleNo) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addPositive("address", address)
                .addNotEmpty("vehicleNo", vehicleNo);
        pager.setSorts(CompanyPayMapper.ORDERBY);
        List<VehicleTotalMile> list = vehicleTotalMileMapper.select(pager, argGen.getArgs());
        List<VehicleTotalMileVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (VehicleTotalMile mile : list) {
                VehicleTotalMileVo vo = new VehicleTotalMileVo(mile);
                vo.setCompanyName(map.get(mile.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<VehicleTotalMile> pageInfo = new PageInfo<>(list);

        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
