package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.DriverReputationVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverReputationService;
import com.wangyueche.dao.DriverReputationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 17:17
 *
 * @author gaojl
 */
@Service
public class DriverReputationServiceImpl implements DriverReputationService{
    @Autowired
    private DriverReputationDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        List<DriverReputation> list = dao.listForPage(page, rows, address, companyId, licenseId, startDate, endDate);
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
