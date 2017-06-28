package com.wangyueche.service;

import com.wangyueche.bean.entity.Gbt2260;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.DistrictsVo;
import com.wangyueche.bean.vo.PositionVo;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfei on 2017/4/12.
 */
public interface CarMonitorService {

    int initFence(String code,String fences);


    public Map<String,List<DistrictsVo>> districts(String code, String type);

    public Map<String,List<PositionVo>> carDistricts(String code);


    /**
     * 根据企业Id查询设备列表
     */
    public PositionVo position(String code,String vehicleNo);

    /**
     * 分段,起终点
     */
    public Map<String, Object> getPark(String vehicleNo, String begin, String end);


    /**
     * 查询时间段的轨迹(一系列点)
     */
    public Map<String, Object> getTrack(String vehicleNo, String begin, String end, String part);

}
