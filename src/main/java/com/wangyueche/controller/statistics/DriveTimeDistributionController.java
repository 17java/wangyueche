package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.DriveTimeDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 * 用车时间段分布
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class DriveTimeDistributionController {
    @Autowired
    private DriveTimeDistributionService service;

    @ResponseBody
    @RequestMapping(value = "/useCar", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId", required = false) String companyId,
                       @RequestParam(value = "startDate", required = false) String startDate,
                       @RequestParam(value = "endDate", required = false) String endDate) {
        return service.listStat(companyId, startDate, endDate);
    }
}
