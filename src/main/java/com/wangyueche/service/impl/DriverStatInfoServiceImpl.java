package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverStatInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverStatInfoVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverStatInfoService;
import com.wangyueche.dao.DriverStatInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/13 8:51
 *
 * @author gaojl
 */
@Service
public class DriverStatInfoServiceImpl implements DriverStatInfoService {
    @Autowired
    private DriverStatInfoDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverStatInfoVo selectDriverStat(String companyId, String licenseId, String driverPhone) {
        DriverStatInfo statInfo = dao.selectDriverStat(companyId, licenseId, driverPhone);
        if (statInfo != null) {
            Map<String, String> map = infoService.idWithName();
            DriverStatInfoVo vo = new DriverStatInfoVo(statInfo);
            vo.setCompanyName(map.get(statInfo.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int page, int pageSize, Integer address, String companyId, String licenseId, String driverPhone) {
        List<DriverStatInfo> list = dao.listForPage(page, pageSize, address, companyId, licenseId, driverPhone);
        List<DriverStatInfoVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverStatInfo info : list) {
                DriverStatInfoVo vo = new DriverStatInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<DriverStatInfo> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
