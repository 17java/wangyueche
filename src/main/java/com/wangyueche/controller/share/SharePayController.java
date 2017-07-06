package com.wangyueche.controller.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.share.SharePayService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 */
@Controller
@RequestMapping(value = "/share", method = RequestMethod.GET)
public class SharePayController {
    @Autowired
    private SharePayService service;

    @ResponseBody
    @RequestMapping("/pay")
    public EasyUIResult list(@RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "10") Integer rows,
                             @RequestParam(required = false) String companyId,
                             @RequestParam(required = false) String routeId,
                             @RequestParam(required = false) String orderId,
                             @RequestParam(required = false) String driverPhone,
                             @RequestParam(required = false) String vehicleNo) {
        Pager pager = new Pager(page, rows);
        return service.findListByCriteria(pager, companyId, routeId, orderId, driverPhone, vehicleNo);
    }
}
