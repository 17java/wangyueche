package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.AlarmInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 * 告警信息
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class AlarmInfoController {
    @Autowired
    private AlarmInfoService service;

    @ResponseBody
    @RequestMapping(value = "/alarm/list")
    public EasyUIResult list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows, @RequestParam(required = false) String type, @RequestParam(required = false) String startDate, @RequestParam(required = false) String endDate) {
        return service.list(page, rows, type, startDate, endDate);
    }
}
