package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyPermit;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPermitVo;
import com.wangyueche.mapper.CompanyPermitMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyPermitService;
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
public class CompanyPermitServiceImpl implements CompanyPermitService {

    @Autowired
    private CompanyPermitMapper companyPermitMapper;

    @Autowired
    private CompanyInfoService companyInfoService;

    @Override
    public CompanyPermitVo selectCompanyPermit(Integer address, String companyId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addPositive("address",address);
        Pager pager = new Pager();
        pager.setSorts(CompanyPermitMapper.ORDERBY);
        pager.max();
        CompanyPermit permit = null;
        List<CompanyPermit> list = companyPermitMapper.selectByExample(pager, argGen.getArgs());
        if (list.size() > 0) {
            permit = list.get(0);
        }
        if (permit != null) {
            Map<String, String> map = companyInfoService.idWithName();
            CompanyPermitVo vo = new CompanyPermitVo(permit);
            vo.setCompanyName(map.get(permit.getCompanyId()));
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String state) {

        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("state", state)
                .addPositive("address",address);

        pager.setSorts(CompanyPermitMapper.ORDERBY);
        List<CompanyPermit> list = companyPermitMapper.selectByExample(pager, argGen.getArgs());
        List<CompanyPermitVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = companyInfoService.idWithName();
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
