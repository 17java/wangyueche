package com.wangyueche.controller.baseinfo;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.DriverInfoVo;
import com.wangyueche.service.DriverAppService;
import com.wangyueche.service.DriverEducateService;
import com.wangyueche.service.DriverInfoService;
import com.wangyueche.service.DriverStatInfoService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lyq
 */
@Controller
@RequestMapping(value = "/driver",method = RequestMethod.GET)
public class DriverController {
    @Autowired
    private DriverInfoService driverInfoService;
    @Autowired
    private DriverAppService driverAppService;
    @Autowired
    private DriverStatInfoService driverStatInfoService;
    @Autowired
    private DriverEducateService driverEducateService;

    @RequestMapping(value = "/info/view",method = RequestMethod.GET)
    @ResponseBody
    public DriverInfoVo view(@RequestParam(value = "address",required = false) Integer address,@RequestParam(value = "companyId",required = false) String companyId, @RequestParam(value = "licenseId",required = false) String licenseId, @RequestParam(value = "driverPhone",required = false) String driverPhone) {
        DriverInfoVo driverInfo = driverInfoService.selectDriverInfo(address, companyId, licenseId, driverPhone);
        if (driverInfo != null) {
            return driverInfo;
        }
        return null;
    }

    @RequestMapping(value = "/info/list")
    @ResponseBody
    public EasyUIResult listforDriverInfo(@RequestParam(value = "page",defaultValue = "1") int page,
                                          @RequestParam(value = "rows",defaultValue = "10") int rows,
                                          @RequestParam(value = "address",required = false) Integer address,
                                          @RequestParam(value = "companyId",required = false) String companyId,
                                          @RequestParam(value = "licenseId",required = false) String licenseId,
                                          @RequestParam(value = "driverName",required = false) String driverName,
                                          @RequestParam(value = "state",required = false) Integer state,
                                          @RequestParam(value = "driverNo",required = false) String driverNo  ) {
        Pager pager = new Pager(page,rows);
        EasyUIResult result = driverInfoService.listForPage(pager, address, companyId, licenseId, driverName, state);
        if (result != null) {
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value ="/app/list" )
    public EasyUIResult listforDriverApp(@RequestParam(value = "page",defaultValue = "1") int page,
                                         @RequestParam(value = "rows",defaultValue = "10") int rows,
                                         @RequestParam(value = "address",required = false) Integer address,
                                         @RequestParam(value = "companyId",required = false) String companyId,
                                         @RequestParam(value = "licenseId",required = false) String licenseId,
                                         @RequestParam(value = "driverPhone",required = false) String driverPhone,
                                         @RequestParam(value = "state",required = false) Integer state) {
        Pager pager = new Pager(page,rows);
        EasyUIResult result = driverAppService.listForPage(pager, address, companyId, licenseId, driverPhone, state);
        if (result != null) {
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/educate/list")
    public EasyUIResult listForDriverEducate(@RequestParam(value = "page",defaultValue = "1") int page,
                                             @RequestParam(value = "rows",defaultValue = "10") int rows,
                                             @RequestParam(value = "address",required = false) Integer address,
                                             @RequestParam(value = "companyId",required = false) String companyId,
                                             @RequestParam(value = "licenseId",required = false) String licenseId,
                                             @RequestParam(value = "courseName",required = false) String courseName,
                                             @RequestParam(value = "driverPhone",required = false) String driverPhone) {
        Pager pager = new Pager(page,rows);
        EasyUIResult result = driverEducateService.listForPage(pager, address, companyId, licenseId, courseName, driverPhone);
        if (result != null) {
            return result;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/stat/list")
    public EasyUIResult listForDriverStatInfo(@RequestParam(value = "page",defaultValue = "1") int page,
                                              @RequestParam(value = "rows",defaultValue = "10") int rows,
                                              @RequestParam(value = "address",required = false) Integer address,
                                              @RequestParam(value = "companyId",required = false) String companyId,
                                              @RequestParam(value = "licenseId",required = false) String licenseId,
                                              @RequestParam(value = "driverPhone",required = false) String driverPhone) {
        Pager pager = new Pager(page,rows);
        EasyUIResult result = driverStatInfoService.listForPage(pager, address, companyId, licenseId, driverPhone);
        if (result != null) {
            return result;
        }
        return new EasyUIResult();
    }
}
