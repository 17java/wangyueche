package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OrderInfoVo;
import com.wangyueche.mapper.OrderInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OrderInfoService;
import com.wangyueche.service.RegionService;
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
 * @author lyq
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private CompanyInfoService infoService;
    @Autowired
    private RegionService regionService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String orderId, String licenseId, String vehicleNo, String driverPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo",vehicleNo)
                .addPositive("address",address)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverPhone",driverPhone)
                .addNotEmpty("licenseId",licenseId);
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat, numFormat);
                argGen.add("orderTime",date);
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
            Map<Integer, String> regionMap = regionService.listRegionIdWithName("340100");
            for (OrderInfo info : list) {
                OrderInfoVo vo = new OrderInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                vo.setRegionName(regionMap.get(info.getAddress()));
                voList.add(vo);
            }
        }
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }

    @Override
    public List<OrderInfo> list(String vehicleNo, String licenseId, String driverPhone, String orderId){
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("licenseId", licenseId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverPhone",driverPhone);
        Pager pager = new Pager().max();
        pager.setSorts(OrderInfoMapper.ORDERBY);
        return orderInfoMapper.select(pager, argGen.getArgs());
    }

    @Override
    public OrderInfo select(String vehicleNo, String licenseId, String driverPhone, String orderId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("licenseId", licenseId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverPhone",driverPhone);
        Pager pager = new Pager().max();
        pager.setSorts(OrderInfoMapper.ORDERBY);
        List<OrderInfo> list = orderInfoMapper.select(pager, argGen.getArgs());
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public int count(String vehicleNo, String licenseId, String driverPhone, String orderId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("licenseId", licenseId)
                .addNotEmpty("vehicleNo", vehicleNo)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverPhone",driverPhone);
        return orderInfoMapper.count(argGen.getArgs());
    }
}
