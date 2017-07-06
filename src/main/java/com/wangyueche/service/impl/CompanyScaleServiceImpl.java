package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyScale;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyScaleVo;
import com.wangyueche.mapper.CompanyScaleMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyScaleService;
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
public class CompanyScaleServiceImpl implements CompanyScaleService {

    @Autowired
    private CompanyScaleMapper companyScaleMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyScaleVo selectCompanyScale(String companyId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId);
        Pager pager = new Pager().max();
        pager.setSorts(CompanyScaleMapper.ORDERBY);
        List<CompanyScale> list = companyScaleMapper.select(pager, argGen.getArgs());
        CompanyScale scale = null;
        if (list.size() > 0){
            scale = list.get(0);
        }
        if (scale != null) {
            CompanyScaleVo vo = new CompanyScaleVo(scale);
            Map<String, String> map = infoService.idWithName();
            vo.setCompanyName(map.get(scale.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, String companyId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId);
        pager.setSorts(CompanyScaleMapper.ORDERBY);
        List<CompanyScale> list = companyScaleMapper.select(pager, argGen.getArgs());

        List<CompanyScaleVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (CompanyScale scale : list) {
                CompanyScaleVo vo = new CompanyScaleVo(scale);
                vo.setCompanyName(map.get(scale.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<CompanyScale> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
