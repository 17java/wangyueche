package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.VehicleOperateStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/8 16:01 .
 * 车辆运行信息统计
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class VehicleOperateStatController {
    @Autowired
    private VehicleOperateStatService service;

    @ResponseBody
    @RequestMapping(value = "/carBusiness", produces = "application/json;charset=UTF-8")
    public String view(@RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate", required = false) String endDate) {
        return service.listStat(companyId, startDate, endDate);
    }

    /**
     * 主页实时车辆运行信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/carBusiness/realTime", produces = "application/json;charset=UTF-8")
    public String view() {
        return service.listIndexInfo();
    }
}
