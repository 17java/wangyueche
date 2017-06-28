package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverEducate;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverEducateVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverEducateService;
import com.wangyueche.dao.DriverEducateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/13 8:49
 *
 * @author gaojl
 */
@Service
public class DriverEducateServiceImpl implements DriverEducateService {
    @Autowired
    private DriverEducateDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverEducateVo selectDriverEducate(String companyId, String licenseId, String driverPhone) {
        DriverEducate educate = dao.selectDriverEducate(companyId, licenseId, driverPhone);
        if (educate != null) {
            Map<String, String> map = infoService.idWithName();
            DriverEducateVo vo = new DriverEducateVo(educate);
            vo.setCompanyName(map.get(educate.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int page, int pageSize, Integer address, String companyId, String licenseId, String courseName,String driverPhone) {
        List<DriverEducate> list = dao.listForPage(page, pageSize, address, companyId, licenseId, courseName,driverPhone);
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
