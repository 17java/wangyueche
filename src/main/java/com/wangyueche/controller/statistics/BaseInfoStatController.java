package com.wangyueche.controller.statistics;

import com.wangyueche.bean.vo.statistics.BaseInfoStat;
import com.wangyueche.service.BaseInfoStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/11 16:33 .
 */
@Controller
@RequestMapping(value = "/statistics")
public class BaseInfoStatController {
    @Autowired
    private BaseInfoStatService statService;

    @ResponseBody
    @RequestMapping(value = "/baseInfo")
    public BaseInfoStat list() {
        return statService.list();
    }
}
