package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverPunish;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.DriverPunishVo;
import com.wangyueche.mapper.DriverPunishMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverPunishService;
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
public class DriverPunishServiceImpl implements DriverPunishService {
    @Autowired
    private DriverPunishMapper driverPunishMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId", licenseId)
                .addPositive("address", address);
        pager.setSorts(DriverPunishMapper.ORDERBY);
        List<DriverPunish> list = driverPunishMapper.select(pager,argGen.getArgs());
        List<DriverPunishVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverPunish punish : list) {
                DriverPunishVo vo = new DriverPunishVo(punish);
                vo.setCompanyName(map.get(punish.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<DriverPunish> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
