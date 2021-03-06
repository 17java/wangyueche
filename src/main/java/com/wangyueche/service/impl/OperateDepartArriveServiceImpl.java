package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperatePayVo;
import com.wangyueche.mapper.OperateDepartArriveMapper;
import com.wangyueche.mapper.OrderInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OperateDepartArriveService;
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
public class OperateDepartArriveServiceImpl implements OperateDepartArriveService {
    @Autowired
    private OperateDepartArriveMapper operateDepartArriveMapper;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String orderId, String driverName, String licenseId, String vehicleNo) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo",vehicleNo)
                .addPositive("address",address)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverName",driverName);
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
        List<OperateDepartArrive> list  = operateDepartArriveMapper.select(pager, argGen.getArgs());
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

    @Override
    public OperateDepartArrive select(String orderId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("orderId", orderId);
        List<OperateDepartArrive> arrives = operateDepartArriveMapper.select(new Pager().max().setSorts(OperateDepartArriveMapper.ORDERBY), argGen.getArgs());
        if (arrives.size() > 0){
            return arrives.get(0);
        }
        return null;
    }

}
