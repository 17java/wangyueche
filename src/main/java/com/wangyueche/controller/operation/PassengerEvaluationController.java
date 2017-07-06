package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.PassengerEvaluationService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 运营监管——乘客评价信息
 * @author lyq
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class PassengerEvaluationController {
    @Autowired
    private PassengerEvaluationService service;

    @ResponseBody
    @RequestMapping(value = "/passengerEvaluation/list")
    public EasyUIResult listForPage(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "10") int rows,
                                    Integer address, String companyId, String orderId,
                                    String vehicleNo, String licenseId, String driverPhone,
                                    String startDate,
                                    String endDate) {
        Pager pager = new Pager(page,rows);
        return service.listForPage(pager, address, companyId, orderId, vehicleNo, licenseId, driverPhone, startDate, endDate);
    }

}
