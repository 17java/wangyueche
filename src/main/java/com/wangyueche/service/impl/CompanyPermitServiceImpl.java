package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyPermit;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPermitVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyPermitService;
import com.wangyueche.dao.CompanyPermitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Service
public class CompanyPermitServiceImpl implements CompanyPermitService {

    @Autowired
    private CompanyPermitDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyPermitVo selectCompanyPermit(Integer address, String companyId) {
        CompanyPermit permit = dao.selectCompanyPermit(address, companyId);
        if (permit != null) {
            Map<String, String> map = infoService.idWithName();
            CompanyPermitVo vo = new CompanyPermitVo(permit);
            vo.setCompanyName(map.get(permit.getCompanyId()));
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String state) {
        List<CompanyPermit> list = dao.listForPage(page, rows, address, companyId, state);
        List<CompanyPermitVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (CompanyPermit permit : list) {
                CompanyPermitVo vo = new CompanyPermitVo(permit);
                vo.setCompanyName(map.get(permit.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<CompanyPermit> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
