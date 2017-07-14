package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.DriverReputationVo;
import com.wangyueche.mapper.DriverReputationMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverReputationService;
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
public class DriverReputationServiceImpl implements DriverReputationService{
    @Autowired
    private DriverReputationMapper driverReputationMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String startDate, String endDate) {

        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId", licenseId)
                .addPositive("address", address);
        pager.setSorts(DriverReputationMapper.ORDERBY);
        List<DriverReputation> list = driverReputationMapper.select(pager,argGen.getArgs());
        List<DriverReputationVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverReputation reputation : list) {
                DriverReputationVo vo = new DriverReputationVo(reputation);
                vo.setCompanyName(map.get(reputation.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<DriverReputation> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
