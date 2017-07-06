package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverEducate;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverEducateVo;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.mapper.CompanyPayMapper;
import com.wangyueche.mapper.DriverEducateMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverEducateService;
import com.wangyueche.service.DriverInfoService;
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
public class DriverEducateServiceImpl implements DriverEducateService {
    @Autowired
    private DriverEducateMapper driverEducateMapper;

    @Autowired
    private DriverInfoService driverInfoService;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverEducateVo selectDriverEducate(String companyId, String licenseId, String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId);
        DriverInfoVo driverInfoVo = driverInfoService.selectDriverInfo(null, null, null, driverPhone);
        if (null != driverInfoVo){
            argGen.addNotEmpty("licenseId",driverInfoVo.getLicenseId());
        }
        Pager pager = new Pager();
        pager.setSorts(DriverEducateMapper.ORDERBY);
        List<DriverEducate> list = driverEducateMapper.select(pager, argGen.getArgs());
        DriverEducate educate = null;
        if (list.size() > 0) {
            educate = list.get(0);
        }
        if (educate != null) {
            Map<String, String> map = infoService.idWithName();
            DriverEducateVo vo = new DriverEducateVo(educate);
            vo.setCompanyName(map.get(educate.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String courseName,String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId)
                .addPositive("address",address)
                .addNotEmpty("courseName",courseName);
        DriverInfoVo driverInfoVo = driverInfoService.selectDriverInfo(null, null, null, driverPhone);
        if (null != driverInfoVo){
            argGen.addNotEmpty("licenseId",driverInfoVo.getLicenseId());
        }
        pager.setSorts(DriverEducateMapper.ORDERBY);
        List<DriverEducate> list = driverEducateMapper.select(pager, argGen.getArgs());
        List<DriverEducateVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverEducate educate : list) {
                DriverEducateVo vo = new DriverEducateVo(educate);
                vo.setCompanyName(map.get(educate.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<DriverEducate> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
