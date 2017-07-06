package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.OperateDepartArriveService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/17 23:51
 * 运营监管——企业营运数据
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class OperatePayController {
    @Autowired
    private OperateDepartArriveService service;

    @RequestMapping(value = "/operate/list")
    @ResponseBody
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "rows", defaultValue = "10") int rows,
                                    @RequestParam(value = "address", required = false) Integer address,
                                    @RequestParam(value = "companyId", required = false) String companyId,
                                    @RequestParam(value = "startDate", required = false) String startDate,
                                    @RequestParam(value = "endDate", required = false) String endDate,
                                    @RequestParam(value = "orderId", required = false) String orderId,
                                    @RequestParam(value = "driverName", required = false) String driverName,
                                    @RequestParam(value = "licenseId", required = false) String licenseId,
                                    @RequestParam(value = "vehicleNo", required = false) String vehicleNo) {
        Pager pager = new Pager(page, rows);
        EasyUIResult result = service.listForPage(pager, address, companyId, startDate, endDate, orderId, driverName, licenseId, vehicleNo);
        if (result != null) {
            return result;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/operate/beyondOperate")
    public EasyUIResult listForBeyondOperate(int page, int rows) {
        return null;
    }
}
