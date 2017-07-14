package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.mapper.DriverInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverInfoService;
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
public class DriverInfoServiceImpl implements DriverInfoService {
    @Autowired
    private DriverInfoMapper driverInfoMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverInfoVo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone) {
        ArgGen args = new ArgGen();
        args.addPositive("address",address)
                .addNotEmpty("companyId",companyId)
                .addNotEmpty("licenseId",licenseId)
                .addNotEmpty("driverPhone", driverPhone);
        Pager pager = new Pager();
        pager.setSorts(DriverInfoMapper.ORDERBY);
        DriverInfo driverInfo  = null;
        List<DriverInfo> list = driverInfoMapper.select(pager, args.getArgs());
        if (list.size() > 0) {
            driverInfo = list.get(0);
        }
        if (driverInfo != null) {
            Map<String, String> map = infoService.idWithName();
            DriverInfoVo vo = new DriverInfoVo(driverInfo);
            vo.setCompanyName(map.get(driverInfo.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address,String companyId, String licenseId, String driverName, Integer state) {
        ArgGen args = new ArgGen();
        args.addPositive("address",address)
                .addNotEmpty("companyId",companyId)
                .addNotEmpty("licenseId",licenseId)
                .addNotEmpty("driverName",driverName)
                .addPositive("state",state);
        pager.setSorts(DriverInfoMapper.ORDERBY);
        List<DriverInfo> list = driverInfoMapper.select(pager, args.getArgs());
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
