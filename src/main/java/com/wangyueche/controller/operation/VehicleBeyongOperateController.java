package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.VehicleBeyondOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/10 9:56 .
 * 超经营车辆
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class VehicleBeyongOperateController {
    @Autowired
    private VehicleBeyondOperateService service;

    @ResponseBody
    @RequestMapping(value = "/beyondOperate/list")
    public EasyUIResult list(@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "rows",defaultValue = "10") Integer rows, @RequestParam(value = "vehicleNo",required = false) String vehicleNo, @RequestParam(value = "startDate",required = false) String startDate, @RequestParam(value = "endDate",required = false) String endDate) {
        EasyUIResult result = service.list(page, rows, vehicleNo, startDate, endDate);
        return result;
    }
}
