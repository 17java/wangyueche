package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OrderInfoVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleSpecialService;
import com.wangyueche.dao.VehicleSpecialDao;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/10 10:43 .
 */
@Service
public class VehicleSpecialServiceImpl implements VehicleSpecialService {
    @Autowired
    private VehicleSpecialDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult list(Integer page, Integer rows, String companyId, String vehicleNo, String orderId, String depPosition, String destPosition,String startDate,String endDate) {
        Long depLong = null;
        Long depLat = null;
        Long destLong = null;
        Long destLat = null;
        if (StringUtils.hasText(depPosition)) {
            String[] dep = depPosition.split(",");
            depLong = (long)(Double.parseDouble(dep[0])*1000000);
            depLat = (long)(Double.parseDouble(dep[1])*1000000);
        }
        if (StringUtils.hasText(destPosition)) {
            String[] dest = destPosition.split(",");
            destLong = (long)(Double.parseDouble(dest[0])*1000000);
            destLat = (long)(Double.parseDouble(dest[1])*1000000);
        }

        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
        }
        List<OrderInfo> list = dao.list(page, rows, companyId, vehicleNo, orderId, depLong, depLat, destLong, destLat,start,end);
        List<OrderInfoVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (OrderInfo info : list) {
                OrderInfoVo vo = new OrderInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }

        PageInfo<OrderInfo> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);

        return result;
    }
}
