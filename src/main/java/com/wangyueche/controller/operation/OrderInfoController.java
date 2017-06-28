package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/17 23:38
 * 运营监管——订单信息
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class OrderInfoController {
    @Autowired
    private OrderInfoService service;

    @ResponseBody
    @RequestMapping(value = "/order/list")
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int rows, @RequestParam(value = "address", required = false) Integer address, @RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate", required = false) String endDate, @RequestParam(value = "orderId", required = false) String orderId, @RequestParam(value = "licenseId", required = false) String licenseId, @RequestParam(value = "vehicleNo", required = false) String vehicleNo, @RequestParam(value = "driverPhone", required = false) String driverPhone) {
        EasyUIResult result = service.listForPage(page, rows, address, companyId, startDate, endDate, orderId, licenseId, vehicleNo, driverPhone);
        if (result != null) {
            return result;
        }
        return null;
    }
}
