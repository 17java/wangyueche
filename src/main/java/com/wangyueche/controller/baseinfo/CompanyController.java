package com.wangyueche.controller.baseinfo;

import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.*;
import com.wangyueche.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Controller
@RequestMapping(value = "/company",method = RequestMethod.GET)
public class CompanyController extends BaseController {

    @Autowired
    private CompanyInfoService companyInfoService;

    @Autowired
    private CompanyFareService companyFareService;

    @Autowired
    private CompanyPayService companyPayService;

    @Autowired
    private CompanyScaleService companyScaleService;

    @Autowired
    private CompanyPermitService companyPermitService;

    @Autowired
    private CompanyServiceService companyServiceService;

    @ResponseBody
    @RequestMapping(value = "/info/view",method = RequestMethod.GET)
    public CompanyInfo view(@RequestParam(value = "address",required = false) Integer address,String companyId){
        CompanyInfo companyInfo = companyInfoService.selectCompanyInfo(address,companyId);
        if (companyInfo != null){
            return companyInfo;
        }
        return null;
    }
    @ResponseBody
    @RequestMapping(value = "/info/list")
    public EasyUIResult listForCompanyInfoPage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows, @RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "state",required = false) Integer state){
        EasyUIResult result = companyInfoService.listForPage(page, rows, companyId, state);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }
    @ResponseBody
    @RequestMapping(value = "/permit/list")
    public EasyUIResult listForCompanyPermitPage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "address",required = false) Integer address,@RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "state",required = false) String state){
        EasyUIResult result = companyPermitService.listForPage(page,rows,address,companyId,state);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/scale/list")
    public EasyUIResult listForCompanyScalePage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "companyId",required = false) String companyId){
        EasyUIResult result = companyScaleService.listForPage(page,rows,companyId);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/pay/list")
    public EasyUIResult listForCompanyPayPage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "state",required = false) Integer state){
        EasyUIResult result = companyPayService.listForPage(page, rows, companyId, state);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/service/list")
    public EasyUIResult listForCompanyServicePage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "address",required = false) Integer address,@RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "serviceName",required = false) String serviceName,@RequestParam(value = "state",required = false) Integer state){
        EasyUIResult result = companyServiceService.listForPage(page, rows, address, companyId, serviceName, state);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/fare/list")
    public EasyUIResult listForCompanyFarePage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "address",required = false) Integer address,@RequestParam(value = "companyId",required = false) String companyId,@RequestParam(value = "fareType",required = false) String fareType,@RequestParam(value = "state",required = false) Integer state){
        EasyUIResult result = companyFareService.listForPage(page, rows, address, companyId, fareType, state);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/name/list",method = RequestMethod.GET)
    public HashMap<String,String> listName() {
        return companyInfoService.idWithName();
    }
}
