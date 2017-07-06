package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyService;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyServiceVo;
import com.wangyueche.mapper.CompanyServiceMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.CompanyServiceService;
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
public class CompanyServiceServiceImpl implements CompanyServiceService {

    @Autowired
    private CompanyServiceMapper companyServiceMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public CompanyServiceVo selectCompanyService(String companyId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId);
        Pager pager = new Pager().max();
        pager.setSorts(CompanyServiceMapper.ORDERBY);
        List<CompanyService> list = companyServiceMapper.select(pager, argGen.getArgs());
        CompanyService service = null;
        if (list.size() > 0) {
            service = list.get(0);
        }
        if (service != null) {
            Map<String, String> map = infoService.idWithName();
            CompanyServiceVo vo = new CompanyServiceVo(service);
            vo.setCompanyName(map.get(service.getCompanyId()));
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String serviceName, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
              .addNotEmpty("serviceName",serviceName)
              .addPositive("address", address)
              .addPositive("state", state);
        pager.setSorts(CompanyServiceMapper.ORDERBY);
        List<CompanyService> list = companyServiceMapper.select(pager, argGen.getArgs());
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
