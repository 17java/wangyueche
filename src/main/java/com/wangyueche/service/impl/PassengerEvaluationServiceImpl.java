package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.PassengerEvaluation;
import com.wangyueche.bean.entity.PassengerEvaluationExample;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.PassengerEvaluationVo;
import com.wangyueche.mapper.OrderInfoMapper;
import com.wangyueche.mapper.PassengerEvaluationMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.OrderInfoService;
import com.wangyueche.service.PassengerEvaluationService;
import com.wangyueche.dao.PassengerEvaluationDao;
import com.wangyueche.util.DateUtil;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.apache.commons.lang3.StringUtils;
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

        if (StringUtils.isNotBlank(vehicleNo)) {
            List<OrderInfo> list = orderInfoService.list(vehicleNo, null, null, null);
            if (list.size() > 0) {
                List<Object> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                argGen.addIn("vehicleNoIn", orderIdList);
            }
        }
        if (StringUtils.isNotBlank(licenseId)) {
            //通过驾驶证号牌查询到订单信息，获取订单号
            List<OrderInfo> list = orderInfoService.list(null, licenseId, null, null);
            if (list.size() > 0) {
                List<Object> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                argGen.addIn("licenseIdIn", orderIdList);
            }
        }

        if (StringUtils.isNotBlank(driverPhone)) {
            //通过驾驶员手机号牌查询到订单信息，获取订单号
            List<OrderInfo> list = orderInfoService.list(null, null, driverPhone, null);
            if (list.size() > 0) {
                List<Object> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                argGen.addIn("driverPhoneIn", orderIdList);
            }
        }

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
