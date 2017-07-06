package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.PassengerInfoService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 * 运营监管——乘客信息
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class PassengerInfoController {
    @Autowired
    private PassengerInfoService service;

    @ResponseBody
    @RequestMapping(value = "/passengerInfo/list")
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "rows", defaultValue = "10") int rows,
                                    @RequestParam(value = "companyId", required = false) String companyId,
                                    @RequestParam(value = "passengerName", required = false) String passengerName,
                                    @RequestParam(value = "passengerPhone", required = false) String passengerPhone) {
        Pager pager = new Pager(page, rows);
        EasyUIResult result = service.listForPage(pager, companyId, passengerName, passengerPhone);
        if (result != null) {
            return result;
        }
        return null;
    }
}
