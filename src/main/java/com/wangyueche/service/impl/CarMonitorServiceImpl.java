package com.wangyueche.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.RegionInfo;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.DistrictsVo;
import com.wangyueche.bean.vo.PositionVo;
import com.wangyueche.bean.vo.SpotVo;
import com.wangyueche.bean.vo.TrackVo;
import com.wangyueche.bean.vo.VehiclepositionJMS;
import com.wangyueche.service.CarMonitorService;
import com.wangyueche.service.cache.DriverPositionCache;
import com.wangyueche.service.cache.OrderCache;
import com.wangyueche.service.cache.PositionCache;
import com.wangyueche.dao.CarMonitorDao;
import com.wangyueche.dao.OperateDepartArriveDao;
import com.wangyueche.dao.OrderInfoDao;
import com.wangyueche.service.mongodb.SpotMongoDao;
import com.wangyueche.util.Common;
import com.wangyueche.util.SpotToVo;
import com.wangyueche.util.SpotToWeb;

/**
 * Created by zhangfei on 2017/4/12.
 */
@Service
public class CarMonitorServiceImpl implements CarMonitorService {

    @Autowired
    CarMonitorDao carMonitorDao;

    @Resource
    private SpotMongoDao spotMongoDao;

    @Autowired
    PositionCache positionCache;

    @Autowired
    DriverPositionCache driverPositionCache;

    @Autowired
    OrderCache orderCache;

    @Autowired
    OrderInfoDao orderInfoDao;

    @Autowired
    private RedisTemplate redisTemplate;
    
    @Override
    public int initFence(String code, String fences) {
        return carMonitorDao.initFence(code, fences);
    }

    @Override
    public   Map<String,List<DistrictsVo>>  districts(String code,String type) {

        Map<String,List<DistrictsVo>> map = new HashMap<String,List<DistrictsVo>>();

        List<DistrictsVo> list = new ArrayList<DistrictsVo>();

        //1根据市编码查县
        List<RegionInfo> ListT = null;

        //加入缓存，避免重复请求数据库
        ListOperations<String, RegionInfo> operations = redisTemplate.opsForList();
        try {
            List<RegionInfo> infos = operations.range("region_" + code, 0, -1);
            if (infos != null && infos.size() > 0) {
                ListT = infos;
            }else{
                ListT = carMonitorDao.districts(code);
                operations.leftPushAll("region_" + code, ListT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(RegionInfo region : ListT ){
            DistrictsVo vo = new DistrictsVo();
            
            vo.setAdcode(region.getRegionCode());
            //2根据县编码和时间查询定位信息
            if(Common.isEmpty(type)){

                //驾驶员0
                Map<String, Integer>  map1 =   driverPositionCache.getDriverByCode(region.getRegionCode());
                vo.setDriverNum(map1.get("drive"));
                //车辆定位1
                Map<String, Integer> map2 = positionCache.getPositionByCodeNum(region.getRegionCode());
                vo.setCarNum(map2.get("car"));
                //日订单2
                int num = orderCache.getOrderNum(region.getRegionCode());
                vo.setOrderNum(num);
                list.add(vo);

                map.put("districts",list);

            }
        }
        return map;
    }

    /**
     * 根据县查车辆分布
     * 1根据县查车定位
     */
    @Override
    public Map<String,List<PositionVo>>carDistricts(String code) {
        Map<String,List<PositionVo>> map = new HashMap<String,List<PositionVo>>();
        List<PositionVo> list = new ArrayList<PositionVo>();
        Map<String, VehiclePosition> m = positionCache.getPositionByCode(code);

        for (String key : m.keySet()) {

            VehiclePosition v = (VehiclePosition)m.get(key);
            if(v != null){
                PositionVo vo = new PositionVo();
                SpotVo so = new SpotVo();
                so.setLat(v.getLatitude());
                so.setLng(v.getLongitude());
                so.setBizStatus(Integer.valueOf(v.getBizStatus()));
                so.setPositionTime(v.getPositionTime());
                vo.setVehicleNo(v.getVehicleNo());
                vo.setPosition(so);
                list.add(vo);
            }
        }
        map.put("cars",list);
        return map;
    }


    
    @Autowired
    OperateDepartArriveDao operateDepartArriveDao;
    
    @Override
    public PositionVo position(String code,String vehicleNo) {
        VehiclePosition position = positionCache.getPosition(code,vehicleNo);
        PositionVo vo = new PositionVo();
        if(position != null){
            SpotVo so = new SpotVo();
            so.setLat(position.getLatitude());
            so.setLng(position.getLongitude());
            so.setPositionTime(position.getPositionTime());
            so.setBizStatus(Integer.valueOf(position.getBizStatus()));
            
            if(position.getOrderId() != null){
            	OrderInfo order = orderInfoDao.selectByOrderId(position.getOrderId());
            	
            	if(order != null ){
            		so.setTel(order.getDriverPhone());
            	}
            	OperateDepartArrive operate = operateDepartArriveDao.selectByOrderId(position.getOrderId());
            	if(operate != null){
            		so.setDriverName(operate.getDriverName());
            	}
                
            }
            
            vo.setVehicleNo(position.getVehicleNo());
            vo.setPosition(so);
        }

        return vo;
    }

    /**
     * 分段,起终点
     * @ vehicleNo  车牌
     */
    public Map<String, Object> getPark(String vehicleNo, String begin, String end) {
        Long beginLong = Common.getLong(begin,-1L);
        Long endLong = Common.getLong(end,-1L);
        Map<String, Object> rs = new HashMap<String, Object>();
        List<VehiclepositionJMS> list =  spotMongoDao.findPositionByVehicleNo(vehicleNo,beginLong, endLong);

        System.out.println("list.size()=============------------"+list.size());
        List<List<VehiclepositionJMS>> rsPart = new ArrayList<List<VehiclepositionJMS>>();
        /**
         * 分段 进入数据倒序(大->小)
         */
        rsPart = SpotToWeb.getPartList(list);

        //如果是车的设备 处理小漂移
        if(rsPart != null && rsPart.size() > 0){
            Iterator<List<VehiclepositionJMS>> partsIter = rsPart.iterator();
            while(partsIter.hasNext()){
                List<VehiclepositionJMS> spotsPart = partsIter.next();
                if(spotsPart != null && spotsPart.size() >= 8){//轨迹段点数大于8个才会判断是否小漂移
                    double distance = SpotToWeb.getDistance(spotsPart.get(0),spotsPart.get(spotsPart.size()-1));
                    if(distance > 400){//如果轨迹段的里程 大于400米 则不是小漂移
                        continue;
                    }
                    boolean smallmove = true;
                    for(int i = 1;i<spotsPart.size();i++){
                        distance = SpotToWeb.getDistance(spotsPart.get(0),spotsPart.get(i));
                        if(distance > 400){//如果两点距离 有一个大于400米 则不是小漂移
                            smallmove = false;
                            break;
                        }
                    }
                    if(smallmove){
                        partsIter.remove();
                    }
                }
            }
        }
        rs.put("track", SpotToVo.listSav(rsPart));
        rs.put("part", 1);
        return rs;
    }


    /**
     * 查询时间段的轨迹(一系列点)
     */
    public Map<String, Object> getTrack(String vehicleNo, String begin, String end, String part) {
        Long beginLong = Long.valueOf(begin);
        Long endLong = Long.valueOf(end);
        Map<String, Object> rs = new HashMap<String, Object>();
        List<VehiclepositionJMS> list =  spotMongoDao.findPositionByVehicleNo(vehicleNo,beginLong, endLong);
        List<TrackVo> list1 = new ArrayList<TrackVo>();
        for(VehiclepositionJMS vo : list){
        	TrackVo v = new TrackVo();
        	v.setLatitude(vo.getLatitude());
        	v.setLongitude(vo.getLongitude());
        	list1.add(v);
        }
        rs.put("track", list1);
        return rs;
    }


}
