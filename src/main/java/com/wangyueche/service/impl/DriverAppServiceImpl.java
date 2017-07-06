package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverApp;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverAppVo;
import com.wangyueche.mapper.DriverAppMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverAppService;
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
public class DriverAppServiceImpl implements DriverAppService {
    @Autowired
    private DriverAppMapper driverAppMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverAppVo selectDriverApp(String companyId, String licenseId, String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId)
                .addNotEmpty("driverPhone",driverPhone);
        Pager pager = new Pager();
        pager.setSorts(DriverAppMapper.ORDERBY);
        List<DriverApp> list = driverAppMapper.select(pager, argGen.getArgs());
        DriverApp app = null;
        if (list.size() > 0){
            app = list.get(0);
        }
        if (app != null) {
            Map<String, String> map = infoService.idWithName();
            DriverAppVo vo = new DriverAppVo(app);
            vo.setCompanyName(map.get(app.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String driverPhone, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId)
                .addNotEmpty("driverPhone",driverPhone)
                .addPositive("address",address)
                .addPositive("state",state);

        pager.setSorts(DriverAppMapper.ORDERBY);
        List<DriverApp> list = driverAppMapper.select(pager, argGen.getArgs());

        List<DriverAppVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverApp app : list) {
                DriverAppVo vo = new DriverAppVo(app);
                vo.setCompanyName(map.get(app.getCompanyId()));
                voList.add(vo);
            }
        }
        EasyUIResult result = new EasyUIResult();
        PageInfo<DriverApp> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
