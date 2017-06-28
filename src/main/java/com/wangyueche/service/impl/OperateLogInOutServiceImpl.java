package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateLogInOut;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperateLogInOutVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OperateLogInOutService;
import com.wangyueche.dao.OperateLogInOutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 16:00
 *
 * @author gaojl
 */
@Service
public class OperateLogInOutServiceImpl implements OperateLogInOutService{
    @Autowired
    private OperateLogInOutDao dao;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo) {
        List<OperateLogInOut> list = dao.listForPage(page, rows, address, companyId, startDate, endDate, licenseId, vehicleNo);
        List<OperateLogInOutVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (OperateLogInOut logInOut : list) {
                OperateLogInOutVo vo = new OperateLogInOutVo(logInOut);
                vo.setCompanyName(map.get(logInOut.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<OperateLogInOut> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
