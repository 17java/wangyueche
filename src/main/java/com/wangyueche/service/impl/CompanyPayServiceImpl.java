package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyPay;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPayVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyPayService;
import com.wangyueche.dao.CompanyPayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Service
public class CompanyPayServiceImpl implements CompanyPayService {

    @Autowired
    private CompanyPayDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyPayVo selectCompanyPay(String companyId) {
        CompanyPay pay = dao.selectCompanyPay(companyId);
        if (pay != null) {
            Map<String, String> map = infoService.idWithName();
            CompanyPayVo vo = new CompanyPayVo(pay);
            vo.setCompanyName(map.get(pay.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int page, int rows, String companyId, Integer state) {
        List<CompanyPay> list = dao.listForPage(page, rows, companyId, state);
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
