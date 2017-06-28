package com.wangyueche.controller.share;

import com.wangyueche.service.share.ShareEfficiencyStatService;
import com.wangyueche.service.share.ShareOperateStatService;
import com.wangyueche.service.share.ShareOrderStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/16 11:22 .
 * 合乘统计信息
 */
@Controller
@RequestMapping(value = "/share/stat", method = RequestMethod.GET)
public class ShareStatisticsController {
    @Autowired
    private ShareOrderStatService orderStatService;

    @Autowired
    private ShareOperateStatService operateStatService;

    @Autowired
    private ShareEfficiencyStatService efficiencyStatService;

    //订单数据统计
    @ResponseBody
    @RequestMapping(value = "/order",produces = "application/json;charset=UTF-8")
    public String shareOrderStat(@RequestParam(required = false) String companyId, @RequestParam(required = false) String startDate, @RequestParam(required = false) String endDate) {
        return orderStatService.listStat(companyId, startDate, endDate);
    }

    //营运数据统计
    @ResponseBody
    @RequestMapping(value = "/operate",produces = "application/json;charset=UTF-8")
    public String shareOperateStat(@RequestParam(required = false) String companyId, @RequestParam(required = false) String startDate, @RequestParam(required = false) String endDate) {
        return operateStatService.listStat(companyId, startDate, endDate);
    }

    //订单效能统计
    @ResponseBody
    @RequestMapping(value = "/efficiency",produces = "application/json;charset=UTF-8")
    public String shareEfficiencyStat(@RequestParam(required = false) String companyId, @RequestParam(required = false) String startDate, @RequestParam(required = false) String endDate) {
        return efficiencyStatService.listStat(companyId, startDate, endDate);
    }
}
