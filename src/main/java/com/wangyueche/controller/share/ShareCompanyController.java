package com.wangyueche.controller.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by lyq
 * 合乘公司基本信息
 */
@Controller
@RequestMapping(value = "/share", method = RequestMethod.GET)
public class ShareCompanyController {
    @Autowired
    private ShareCompanyService service;

    @ResponseBody
    @RequestMapping("/company")
    public EasyUIResult list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "rows", defaultValue = "10") Integer rows,
                             @RequestParam(value = "companyId", required = false) String companyId,
                             @RequestParam(value = "state", required = false) Integer state) {
        Pager pager = new Pager(page, rows);
        return service.findListByCriteria(pager, companyId, state);
    }

    @ResponseBody
    @RequestMapping("/company/names")
    public Map<String, String> listComapnyNames() {
        return service.listCompanyNames();
    }
}
