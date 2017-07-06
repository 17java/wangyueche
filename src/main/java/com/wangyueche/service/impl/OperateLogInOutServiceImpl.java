package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateLogInOut;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperateLogInOutVo;
import com.wangyueche.mapper.OrderInfoMapper;
import com.wangyueche.mapper.OperateLogInOutMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OperateLogInOutService;
import com.wangyueche.dao.OperateLogInOutDao;
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
public class OperateLogInOutServiceImpl implements OperateLogInOutService{
    @Autowired
    private OperateLogInOutMapper operateLogInOutMapper;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("vehicleNo",vehicleNo)
                .addPositive("address",address)
                .addNotEmpty("licenseId",licenseId)
                .addNotEmpty("vehicleNo",vehicleNo);
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat, numFormat);
                argGen.add("logoutTime",date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            argGen.add("logoutTimeBetween", " between " + startDate + " and " + endDate);
        }
        pager.setSorts(OrderInfoMapper.ORDERBY);
        List<OperateLogInOut> list = operateLogInOutMapper.select(pager, argGen.getArgs());
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
