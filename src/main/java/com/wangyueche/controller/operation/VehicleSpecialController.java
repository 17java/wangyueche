package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.VehicleSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/10 10:56 .
 * 特殊车辆查找
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class VehicleSpecialController {
    @Autowired
    private VehicleSpecialService service;

    @ResponseBody
    @RequestMapping(value = "/vehicleSpecial/list")
    public EasyUIResult list(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "rows", defaultValue = "10") Integer rows, @RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "vehicleNo", required = false) String vehicleNo, @RequestParam(value = "orderId", required = false) String orderId, @RequestParam(value = "departure", required = false) String depPosition, @RequestParam(value = "destination", required = false) String destPosition,@RequestParam(value = "startDate",required = false) String startDate,@RequestParam(value = "endDate",required = false) String endDate) {
        EasyUIResult result = service.list(page, rows, companyId, vehicleNo, orderId, depPosition, destPosition, startDate, endDate);
        return result;
    }
}
