package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperatePayVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OperateDepartArriveService;
import com.wangyueche.dao.OperateDepartArriveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 15:18
 *
 * @author gaojl
 */
@Service
public class OperateDepartArriveServiceImpl implements OperateDepartArriveService {
    @Autowired
    private OperateDepartArriveDao dao;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String orderId, String driverName, String licenseId, String vehicleNo) {
        List<OperateDepartArrive> list = dao.listForPage(page, rows, address, companyId, startDate, endDate, orderId, driverName, licenseId, vehicleNo);
        List<OperatePayVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (OperateDepartArrive operateDepartArrive : list) {
                OperatePayVo vo = new OperatePayVo(operateDepartArrive);
                vo.setCompanyName(map.get(operateDepartArrive.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<OperateDepartArrive> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }

}
