package com.wangyueche.controller.credit;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.credit.CreditCompanyService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyq
 * 职业征信
 */
@Controller
@RequestMapping(value = "/credit/company", method = RequestMethod.GET)
public class CreditCompanyController {
    @Autowired
    private CreditCompanyService companyService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public EasyUIResult list(@RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "10") Integer rows,
                             @RequestParam(required = false) String companyId) {
        Pager pager = new Pager(page, rows);
        return companyService.list(pager, companyId);
    }

    /**
     * 企业评价星数统计图
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/rankingStatistics/star", produces = "application/json;charset=UTF-8")
    public String showStarStat() {
        return companyService.showStarStat();
    }

    /**
     * 企业评价满意度统计图
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/rankingStatistics/satisfaction", produces = "application/json;charset=UTF-8")
    public String showSatisStat() {
        return companyService.showSatisStat();
    }
}
