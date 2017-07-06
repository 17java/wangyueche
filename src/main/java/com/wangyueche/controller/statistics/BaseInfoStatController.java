package com.wangyueche.controller.statistics;

import com.wangyueche.bean.vo.statistics.BaseInfoStat;
import com.wangyueche.service.BaseInfoStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 */
@Controller
@RequestMapping(value = "/statistics")
public class BaseInfoStatController {
    @Autowired
    private BaseInfoStatService baseInfoStatService;

    @ResponseBody
    @RequestMapping(value = "/baseInfo")
    public BaseInfoStat list() {
        return baseInfoStatService.statistics();
    }
}
