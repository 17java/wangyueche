package com.wangyueche.service.cache;

import com.wangyueche.bean.entity.DriverPosition;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 驾驶员实时定位信息
 */
@Component
public class DriverPositionCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String DRIVER = "driver_";

    private static final String DRIVERCODE = "driver_code";


    /**
     * code  行政区域编码
     * map key-- String: LicenseId  机动车驾驶证号
     *     var---DriverPosition:驾驶员定位信息
     */
    public void setDriver(String code , Map<String, String> map ) {
        redisTemplate.opsForHash().putAll(DRIVER+code,map);
    }

    /**
     * 获取该行政区域驾驶员定位信息--实时
     * @param code  行政区域编码
     * return
     */
//    public Map<String, DriverPosition> getDriverByCode(String code) {
//        Map<String, DriverPosition> result = new HashMap<String, DriverPosition>();
//        Map<Object, Object> map = (Map<Object, Object>)redisTemplate.opsForHash().entries(DRIVER+code);
//        for (Map.Entry<Object, Object> entry : map.entrySet()) {
//            result.put("drive"+(String)entry.getKey(),JsonUtil.json2Obj((String)entry.getValue(), DriverPosition.class));
//        }
//        return result;
//    }

    public Map<String, Integer> getDriverByCode(String code) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        Map<Object, Object> map = (Map<Object, Object>)redisTemplate.opsForHash().entries(DRIVER+code);
        result.put("drive",map.size());
        return result;
    }

    /**
     * 驾驶员与区域关系表
     * 用来解决跨域驾驶员删除上次所在区域信息
     *  LicenseId  机动车驾驶证号
     *  code 行政区域编码
     */
    public void setDriverCode(String licenseId , Integer code ) {
        redisTemplate.opsForHash().put(DRIVERCODE, licenseId,code);
    }

    /**
     * LicenseId  机动车驾驶证号
     */
    public  String  getDriverByLicense(String licenseId){
        return (String) redisTemplate.opsForHash().get(DRIVERCODE,licenseId);
    }

    /**
     * @param code  行政区域编码
     * @param licenseId   机动车驾驶证号
     *  return
     */
    public VehiclePosition getDriver(String code,String licenseId) {
        String json = (String)redisTemplate.opsForHash().get(DRIVER+code, licenseId);
        if(json != null && !"".equals(json)){
            return JsonUtil.json2Obj(json, VehiclePosition.class);
        }
        return null;
    }




}
