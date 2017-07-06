package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.VehicleBeyondOperateService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 * 超经营车辆
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class VehicleBeyongOperateController {
    @Autowired
    private VehicleBeyondOperateService vehicleBeyondOperateService;

    @ResponseBody
    @RequestMapping(value = "/beyondOperate/list")
    public EasyUIResult list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "rows", defaultValue = "10") Integer rows,
                             @RequestParam(value = "vehicleNo", required = false) String vehicleNo,
                             @RequestParam(value = "startDate", required = false) String startDate,
                             @RequestParam(value = "endDate", required = false) String endDate) {
        Pager pager = new Pager(page, rows);
        EasyUIResult result = vehicleBeyondOperateService.list(pager, vehicleNo, startDate, endDate);
        return result;
    }
}
