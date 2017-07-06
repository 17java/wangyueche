package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.DriverReputationStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 驾驶员信誉信息
 * Created by gaojl on 2017/5/9 6:48.
 */
@Controller
@RequestMapping(value = "/statistics/serviceQuality", method = RequestMethod.GET)
public class DriverReputationStatController {
    @Autowired
    private DriverReputationStatService statService;

    @ResponseBody
    @RequestMapping(value = "/driverReputation", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId",required = false) String companyId,
                       @RequestParam(value = "startDate",required = false) String startDate,
                       @RequestParam(value = "endDate",required = false) String endDate) {
        return statService.listStat(companyId, startDate, endDate);
    }
}
