package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.VehicleBeyondOperateStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 超经营统计
 * Created by lyq
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class VehicleBeyondOperateController {
    @Autowired
    private VehicleBeyondOperateStatService service;

    @ResponseBody
    @RequestMapping(value = "/overManagement", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId",required = false) String companyId,
                       @RequestParam(value = "startDate",required = false) String startDate,
                       @RequestParam(value = "endDate",required = false) String endDate) {
        return service.listStat(companyId, startDate, endDate);
    }
}
