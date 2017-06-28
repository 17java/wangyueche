package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.VehicleInsurance;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInsuranceVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleInsuranceService;
import com.wangyueche.dao.VehicleInsuranceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/13 17:44
 *
 * @author gaojl
 */
@Service
public class VehicleInsuranceServiceImpl implements VehicleInsuranceService {
    @Autowired
    private VehicleInsuranceDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String vehicleNo, String insurCom) {
        List<VehicleInsurance> list = dao.listForPage(page, rows, address, companyId, vehicleNo, insurCom);
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
