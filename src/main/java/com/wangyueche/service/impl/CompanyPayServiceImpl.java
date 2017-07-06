package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyPay;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPayVo;
import com.wangyueche.mapper.CompanyPayMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyPayService;
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
public class CompanyPayServiceImpl implements CompanyPayService {

    @Autowired
    private CompanyPayMapper companyPayMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyPayVo selectCompanyPay(String companyId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId);
        Pager pager = new Pager();
        pager.setSorts(CompanyPayMapper.ORDERBY);
        List<CompanyPay> list = companyPayMapper.select(pager, argGen.getArgs());
        CompanyPay pay = null;
        if (list.size() > 0){
            pay = list.get(0);
        }
        if (pay != null) {
            Map<String, String> map = infoService.idWithName();
            CompanyPayVo vo = new CompanyPayVo(pay);
            vo.setCompanyName(map.get(pay.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, String companyId, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
              .addPositive("state", state);
        pager.setSorts(CompanyPayMapper.ORDERBY);
        List<CompanyPay> list = companyPayMapper.select(pager, argGen.getArgs());

        List<CompanyPayVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            //得到comapnyid和companyName对应的map
            Map<String, String> map = infoService.idWithName();
            for (CompanyPay pay : list) {
                CompanyPayVo vo = new CompanyPayVo(pay);
                vo.setCompanyName(map.get(pay.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<CompanyPay> payPageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(payPageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
