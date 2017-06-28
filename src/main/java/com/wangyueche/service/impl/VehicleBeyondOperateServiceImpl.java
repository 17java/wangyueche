package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperatePayVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleBeyondOperateService;
import com.wangyueche.dao.VehicleBeyondOperateDao;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/10 9:24 .
 */
@Service
public class VehicleBeyondOperateServiceImpl implements VehicleBeyondOperateService {
    @Autowired
    private VehicleBeyondOperateDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult list(Integer page, Integer rows, String vehicleNo, String startDate, String endDate) {
        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
        }
        List<OperateDepartArrive> list = dao.list(page, rows, vehicleNo, start, end);
        List<OperatePayVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (OperateDepartArrive info : list) {
                OperatePayVo vo = new OperatePayVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }

        PageInfo<OperateDepartArrive> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setRows(voList);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
