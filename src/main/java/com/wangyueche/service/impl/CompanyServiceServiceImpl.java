package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyService;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyServiceVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyServiceService;
import com.wangyueche.dao.CompanyServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Service
public class CompanyServiceServiceImpl implements CompanyServiceService {

    @Autowired
    private CompanyServiceDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyServiceVo selectCompanyService(String companyId) {
        CompanyService service = dao.selectCompanyService(companyId);
        if (service != null) {
            Map<String, String> map = infoService.idWithName();
            CompanyServiceVo vo = new CompanyServiceVo(service);
            vo.setCompanyName(map.get(service.getCompanyId()));
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String serviceName, Integer state) {
        List<CompanyService> list = dao.listForPage(page, rows, address, companyId, serviceName, state);
        List<CompanyServiceVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String,String> map = infoService.idWithName();
            for (CompanyService service : list) {
                CompanyServiceVo vo = new CompanyServiceVo(service);
                vo.setCompanyName(map.get(service.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<CompanyService> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
