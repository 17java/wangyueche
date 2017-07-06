package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.VehicleInsurance;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInsuranceVo;
import com.wangyueche.mapper.VehicleInsuranceMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleInsuranceService;
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
public class VehicleInsuranceServiceImpl implements VehicleInsuranceService {
    @Autowired
    private VehicleInsuranceMapper vehicleInsuranceMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String vehicleNo, String insurCom) {
        ArgGen argGen  = new ArgGen();
        argGen.addNotEmpty("companyId",companyId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addNotEmpty("insurCom",insurCom)
                .addPositive("address", address);
        pager.setSorts(VehicleInsuranceMapper.ORDERBY);
        List<VehicleInsurance> list = vehicleInsuranceMapper.select(pager, argGen.getArgs());
        List<VehicleInsuranceVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (VehicleInsurance insurance : list) {
                VehicleInsuranceVo vo = new VehicleInsuranceVo(insurance);
                vo.setCompanyName(map.get(insurance.getCompanyId()));
                voList.add(vo);
            }
        }
        EasyUIResult result = new EasyUIResult();
        PageInfo<VehicleInsurance> pageInfo = new PageInfo<>(list);

        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
