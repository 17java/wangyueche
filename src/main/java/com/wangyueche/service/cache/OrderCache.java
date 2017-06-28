package com.wangyueche.service.cache;

import com.wangyueche.bean.entity.DriverPosition;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.util.DateUtil;
import com.wangyueche.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单实时信息
 */
@Component
public class OrderCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String ORDER = "order";

    /**
     * code  行政区域编码
     * num   日订单数
     */
    public void setOrderNum(String code , Integer num ) {
        redisTemplate.opsForHash().increment(getOrderPre(),code,num);
    }


    /**
     * code  行政区域编码
     */
    public  int  getOrderNum(String code){
        Object obj = redisTemplate.opsForHash().get(getOrderPre(),code);
        if(obj != null){
            return (Integer)obj;
        }
        return 0;
    }

    /**
     * 获取订单前缀
     * @return
     */
    private static String getOrderPre(){
        return String.format("%s_%s",ORDER,  DateUtil.format(new Date(), "yyyyMMdd") );
    }


}
