package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.DriverStatInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.bean.vo.baseinfo.DriverStatInfoVo;
import com.wangyueche.mapper.DriverStatInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.DriverInfoService;
import com.wangyueche.service.DriverStatInfoService;
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
public class DriverStatInfoServiceImpl implements DriverStatInfoService {
    @Autowired
    private DriverStatInfoMapper driverStatInfoMapper;

    @Autowired
    private DriverInfoService driverInfoService;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public DriverStatInfoVo selectDriverStat(String companyId, String licenseId, String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId);
        DriverInfoVo driverInfo = driverInfoService.selectDriverInfo(null,null,null,driverPhone);
        if (null != driverInfo){
            argGen.addNotEmpty("licenseId",driverInfo.getLicenseId());
        }
        Pager pager = new Pager();
        pager.setSorts(DriverStatInfoMapper.ORDERBY);
        List<DriverStatInfo> list = driverStatInfoMapper.select(pager, argGen.getArgs());
        DriverStatInfo statInfo = null;
        if (list.size() > 0){
            statInfo = list.get(0);
        }
        if (statInfo != null) {
            Map<String, String> map = infoService.idWithName();
            DriverStatInfoVo vo = new DriverStatInfoVo(statInfo);
            vo.setCompanyName(map.get(statInfo.getCompanyId()));
            return vo;
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String licenseId, String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("licenseId",licenseId)
                .addPositive("address",address);
        DriverInfoVo driverInfo = driverInfoService.selectDriverInfo(null,null,null,driverPhone);
        if (null != driverInfo){
            argGen.addNotEmpty("licenseId",driverInfo.getLicenseId());
        }
        pager.setSorts(DriverStatInfoMapper.ORDERBY);
        List<DriverStatInfo> list = driverStatInfoMapper.select(pager, argGen.getArgs());
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
