package com.wangyueche.controller.baseinfo;

import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.VehicleInfoVo;
import com.wangyueche.service.VehicleInsuranceService;
import com.wangyueche.service.VehicleService;
import com.wangyueche.service.VehicleTotalMileService;
import com.wangyueche.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Gavin on 2017/4/12.
 */
@Controller
@RequestMapping(value="/vehicle" ,method = RequestMethod.GET)
public class VehicleController extends BaseController{
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleInsuranceService insuranceService;
    @Autowired
    private VehicleTotalMileService totalMileService;

    /**
     *车辆基本信息
     * @param address
     * @param companyId
     * @param vehicleNo
     * @return 对象
     */
    @ResponseBody
    @RequestMapping(value = "/info/view", method = RequestMethod.GET)
    public VehicleInfoVo view(@RequestParam(value = "address",required = false) Integer address, @RequestParam(value = "companyId",required = false) String companyId, @RequestParam(value = "vehicleNo",required = false) String vehicleNo) {
        return  vehicleService.selectVehicle(address,companyId,vehicleNo);
    }
    /**
     * 分页查询车辆基本信息
     * @param pageCurrent
     * @param pageSize
     * @param address
     * @param companyId
     * @param vehicleNo
     * @param state
     * @return list
     */
    @ResponseBody
    @RequestMapping(value = "/info/list")
    public EasyUIResult queryForVehicleInsurancePage(@RequestParam(value = "page", defaultValue = "1") int pageCurrent, @RequestParam(value = "rows", defaultValue = "10") int pageSize, @RequestParam(value = "address", required = false) Integer address, @RequestParam(value = "companyId", required = false) String companyId,@RequestParam(value = "vehicleNo", required = false) String vehicleNo,@RequestParam(value = "state", required = false) Integer state) {
        EasyUIResult result = vehicleService.listForPage(pageCurrent, pageSize, address, companyId,vehicleNo,state);
        if (result!=null) {
            return result;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/insurance/list")
    public EasyUIResult listForVehicleInsurance(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "rows",defaultValue = "10") int rows, @RequestParam(value = "address",required = false) Integer address, @RequestParam(value = "companyId",required = false) String companyId, @RequestParam(value = "vehicleNo",required = false) String vehicleNo, @RequestParam(value = "insurCom",required = false) String insurCom) {
        EasyUIResult result = insuranceService.listForPage(page, rows, address, companyId, vehicleNo, insurCom);
        if (result != null) {
            return result;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/totalMile/list")
    public EasyUIResult listForVehicleTotalMile(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "rows",defaultValue = "10") int rows, @RequestParam(value = "address",required = false) Integer address, @RequestParam(value = "companyId",required = false) String companyId, @RequestParam(value = "vehicleNo",required = false) String vehicleNo) {
        EasyUIResult result = totalMileService.listForPage(page, rows, address, companyId, vehicleNo);
        if (result != null) {
            return result;
        }
        return null;
    }

}
