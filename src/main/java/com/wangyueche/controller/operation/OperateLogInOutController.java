package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.OperateLogInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/18 0:00
 * 运营监管——车辆上下线
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class OperateLogInOutController {
    @Autowired
    private OperateLogInOutService service;

    @ResponseBody
    @RequestMapping(value = "logInOut/list")
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int rows, @RequestParam(value = "address", required = false) Integer address, @RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate", required = false) String endDate, @RequestParam(value = "licenseId", required = false) String licenseId, @RequestParam(value = "vehicleNo", required = false) String vehicleNo) {
        EasyUIResult result = service.listForPage(page, rows, address, companyId, startDate, endDate, licenseId, vehicleNo);
        if (result != null) {
            return result;
        }
        return null;
    }
}
