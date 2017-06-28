package com.wangyueche.controller.carMonitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangyueche.bean.vo.DistrictsVo;
import com.wangyueche.bean.vo.PositionVo;
import com.wangyueche.service.CarMonitorService;
import com.wangyueche.util.base.BaseController;

/**;
 * Created by zhangfei on 2017/4/11.
 */
@Controller
@RequestMapping(value = "/carMonitor")
public class CarMonitorController extends BaseController {

    @Autowired
    CarMonitorService carMonitorService;

    /**
     * 保存区县围栏信息
     * init
     */
    @RequestMapping(value = "/initFence", method = RequestMethod.POST)
    @ResponseBody
    public void initFence(String code,String fences) {
        System.out.println(code+"-----------"+fences);
        carMonitorService.initFence(code,fences);
    }

    /**
     * 根据市查县聚合
     * 1根据市查县
     * 2根据县查车数量
     * @param code  市编码
     * @param  type  0 驾驶员 1 车辆 2 订单
     */
    @ResponseBody
    @RequestMapping(value = "districts", method = RequestMethod.POST)
    public  Map<String,List<DistrictsVo>> districts(String code,String type) {
        Map<String,List<DistrictsVo>> map = carMonitorService.districts(code,type);
        return  map;
    }

    /**
     * 根据区县查车辆分布
     */
    @RequestMapping(value = "carDistricts", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,List<PositionVo>> carDistricts(String code) {
        Map<String,List<PositionVo>> result = new HashMap<String,List<PositionVo>>();
        result = carMonitorService.carDistricts(code);
        return  result;
    }

    /**
     * 获取单个轨迹信息,实时定位信息
     * @param  vehicleNo 车牌号
     */
    @RequestMapping(value = "position", method = RequestMethod.POST)
    @ResponseBody
    public  PositionVo position(String code,String vehicleNo) {
        PositionVo vo = carMonitorService.position(code,vehicleNo);
        return vo;
    }

    /**
     * 轨迹回放信息(起终点)
     */
    @RequestMapping(value = "getpart", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getPark(String vehicleNo, String begin, String end) {
        Map<String, Object> rs = new HashMap<String, Object>();
        rs.put("ret", 1);
        rs.putAll(carMonitorService.getPark(vehicleNo, begin, end));
        return rs;
    }

    /**
     * 轨迹回放信息(一系列点)
     * part 暂时无用
     */
    @RequestMapping(value = "gettrack", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getTrack(String vehicleNo, String begin, String end,String part) {
        Map<String, Object> rs = new HashMap<String, Object>();
        rs.put("ret", 1);
        rs.putAll(carMonitorService.getTrack(vehicleNo, begin, end, part));
        return rs;
    }


}
