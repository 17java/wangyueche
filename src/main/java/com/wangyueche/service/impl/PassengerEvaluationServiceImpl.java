package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.PassengerEvaluation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.PassengerEvaluationVo;
import com.wangyueche.mapper.PassengerEvaluationMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OrderInfoService;
import com.wangyueche.service.PassengerEvaluationService;
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
public class PassengerEvaluationServiceImpl implements PassengerEvaluationService {
    @Autowired
    private PassengerEvaluationMapper passengerEvaluationMapper;

    @Autowired
    private OrderInfoService orderInfoService;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone, String startDate, String endDate) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("orderId", orderId);
       /* if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat, numFormat);
                argGen.add("driverPhoneIn", orderIdList);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andEvaluateTimeBetween(start, end);
        }*/
        pager.setSorts(PassengerEvaluationMapper.ORDERBY);
        List<PassengerEvaluation> list = passengerEvaluationMapper.select(pager, argGen.getArgs());

        List<PassengerEvaluationVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (PassengerEvaluation evaluation : list) {
                PassengerEvaluationVo vo = new PassengerEvaluationVo(evaluation);
                vo.setCompanyName(map.get(evaluation.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<PassengerEvaluation> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
