package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.PassengerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/18 0:05
 * 运营监管——乘客信息
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation",method = RequestMethod.GET)
public class PassengerInfoController {
    @Autowired
    private PassengerInfoService service;

    @ResponseBody
    @RequestMapping(value = "/passengerInfo/list")
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int rows, @RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "passengerName", required = false) String passengerName, @RequestParam(value = "passengerPhone", required = false) String passengerPhone) {
        EasyUIResult result = service.listForPage(page, rows, companyId, passengerName, passengerPhone);
        if (result != null) {
            return result;
        }
        return null;
    }
}
