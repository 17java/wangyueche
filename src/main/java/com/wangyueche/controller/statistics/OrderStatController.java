package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.OrderStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/28 9:39
 *订单信息统计
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class OrderStatController {
    @Autowired
    private OrderStatService service;

    @ResponseBody
    @RequestMapping(value = "/orderBusiness", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate", required = false) String endDate) {
        return service.echartStatInfo(companyId, startDate, endDate);
    }

    /**
     * 主页实时订单信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/orderBusiness/realTime", produces = "application/json;charset=UTF-8")
    public String viewIndex() {
        return service.listIndexInfo();
    }
}
