package com.wangyueche.controller.operation;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.PassengerComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaojl on 2017/4/18 0:09
 * 运营监管——乘客投诉信息
 *
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/operation", method = RequestMethod.GET)
public class PassengerComplaintController {
    @Autowired
    private PassengerComplaintService service;

    @RequestMapping(value = "/passengerComplaint/list")
    @ResponseBody
    public EasyUIResult listForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int rows, @RequestParam(value = "address", required = false) Integer address, @RequestParam(value = "companyId", required = false) String companyId, @RequestParam(value = "orderId", required = false) String orderId, @RequestParam(value = "passengerPhone", required = false) String passengerPhone, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate", required = false) String endDate) {
        EasyUIResult result = service.listForPage(page, rows, address, companyId, orderId, passengerPhone, startDate, endDate);
        if (result != null) {
            return result;
        }
        return null;
    }
}
