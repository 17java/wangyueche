package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OrderInfoVo;
import com.wangyueche.mapper.OrderInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleSpecialService;
import com.wangyueche.util.DateUtil;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class VehicleSpecialServiceImpl implements VehicleSpecialService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult list(Pager pager, String companyId, String vehicleNo, String orderId, String depPosition, String destPosition, String startDate, String endDate) {
        Long depLong = null;
        Long depLat = null;
        Long destLong = null;
        Long destLat = null;
        if (StringUtils.hasText(depPosition)) {
            String[] dep = depPosition.split(",");
            depLong = (long) (Double.parseDouble(dep[0]));
            depLat = (long) (Double.parseDouble(dep[1]));
        }
        if (StringUtils.hasText(destPosition)) {
            String[] dest = destPosition.split(",");
            destLong = (long) (Double.parseDouble(dest[0]));
            destLat = (long) (Double.parseDouble(dest[1]));
        }
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addNotEmpty("orderId", orderId);

        if (depLong != null && depLat != null) {
            argGen.add("depLongPostion", " dep_longitude between " + (double) (depLong - 5) + " and " + (double) (depLong + 5));
            argGen.add("depLatPostion", " dep_latitude between " + (double) (depLat - 5) + " and " + (double) (depLat + 5));
        }
        if (destLong != null && destLat != null) {
            argGen.add("destLongPostion", " dest_longitude between " + (double) (destLong - 5) + " and " + (double) (destLong + 5));
            argGen.add("destLatPostion", " dest_latitude between " + (double) (destLat - 5) + " and " + (double) (destLat + 5));
        }

        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat, numFormat);
                argGen.add("orderTime", date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            argGen.add("orderTimeBetween", " between " + startDate + " and " + endDate);
        }
        pager.setSorts(OrderInfoMapper.ORDERBY);
        List<OrderInfo> list = orderInfoMapper.select(pager, argGen.getArgs());
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
