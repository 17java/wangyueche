package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverPunish;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.DriverPunishVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverPunishService;
import com.wangyueche.dao.DriverPunishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 17:13
 *
 * @author gaojl
 */
@Service
public class DriverPunishServiceImpl implements DriverPunishService {
    @Autowired
    private DriverPunishDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate) {
        List<DriverPunish> list = dao.listForPage(page, rows, address, companyId, licenseId, startDate, endDate);
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
