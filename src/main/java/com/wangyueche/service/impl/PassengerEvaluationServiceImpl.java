package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.PassengerEvaluation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.PassengerEvaluationVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.PassengerEvaluationService;
import com.wangyueche.dao.PassengerEvaluationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 16:36
 *
 * @author gaojl
 */
@Service
public class PassengerEvaluationServiceImpl implements PassengerEvaluationService {
    @Autowired
    private PassengerEvaluationDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone, String startDate, String endDate) {
        List<PassengerEvaluation> list = dao.listForPage(page, rows, address, companyId, orderId, vehicleNo, licenseId, driverPhone, startDate, endDate);
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
