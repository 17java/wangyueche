package com.wangyueche.controller.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.share.ShareOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/5/15 12:10 .
 */
@Controller
@RequestMapping(value = "/share", method = RequestMethod.GET)
public class ShareOrderController {
    @Autowired
    private ShareOrderService service;

    @ResponseBody
    @RequestMapping(value = "/order")
    public EasyUIResult list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows, @RequestParam(required = false) String companyId, @RequestParam(required = false) String routeId, @RequestParam(required = false) String orderId) {
        return service.findListByCriteria(page, rows, companyId, routeId, orderId);
    }
}
