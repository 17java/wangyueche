package com.wangyueche.controller.statistics;

import com.wangyueche.service.statistics.VehicleOrderTakingSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lyq
 * 车辆接单量分布
 */
@Controller
@RequestMapping(value = "/statistics/businessStatus", method = RequestMethod.GET)
public class VehicleOrderTakingController {
    @Autowired
    private VehicleOrderTakingSerivce serivce;

    @ResponseBody
    @RequestMapping(value = "/carOrder/{type}", produces = "application/json;charset=UTF-8")
    public String viewBar(@RequestParam(value = "companyId", required = false) String companyId,
                          @RequestParam(value = "startDate", required = false) String startDate,
                          @RequestParam(value = "endDate", required = false) String endDate,
                          @PathVariable(value = "type") String type) {
        return serivce.listBarStat(companyId, startDate, endDate,type);
    }

}
