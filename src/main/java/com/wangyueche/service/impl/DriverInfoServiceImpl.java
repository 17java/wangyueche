package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverInfoService;
import com.wangyueche.dao.DriverInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/13 8:50
 *
 * @author gaojl
 */
@Service
public class DriverInfoServiceImpl implements DriverInfoService {
    @Autowired
    private DriverInfoDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverInfoVo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone) {
        DriverInfo driverInfo = dao.selectDriverInfo(address, companyId, licenseId, driverPhone);
        if (driverInfo != null) {
            Map<String, String> map = infoService.idWithName();
            DriverInfoVo vo = new DriverInfoVo(driverInfo);
            vo.setCompanyName(map.get(driverInfo.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(int pageCurrent, int pageSize, Integer address,String companyId, String licenseId, String driverName, Integer state) {

        List<DriverInfo> list = dao.listForPage(pageCurrent, pageSize, address, companyId, licenseId, driverName, state);
        List<DriverInfoVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (DriverInfo info : list) {
                DriverInfoVo vo = new DriverInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<DriverInfo> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
