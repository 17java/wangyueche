package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.CompanyMarketShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/30 11:47
 * 平台市场占有率
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class CompanyMarketShareController {
    @Autowired
    private CompanyMarketShareService service;

    @ResponseBody
    @RequestMapping(value = "/platformScale", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "startDate",required = false) String startDate, @RequestParam(value = "endDate",required = false) String endDate) {
        return service.marketShareStat(companyId, startDate, endDate);
    }

}
