package com.wangyueche.service.cache;

/**
 * Created by zhangfei on 2017/4/27.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 异常聚集缓存类
 */
@Component
public class AbnormalagCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final String ABNORMALAG = "abnormalag_";

    /**
     * id-- 异常围栏ID
     * num---进入围栏车辆数
     */
    public void incrementNum(String id, int num){
		redisTemplate.opsForHash().increment(ABNORMALAG,id,num);
	}

    /**
     *获取异常围栏车辆数
     */
    public Integer getAbnormalagNum(String id){
        Object num = redisTemplate.opsForHash().get(ABNORMALAG, id );
        if(num == null)
            return 0;
        return Integer.parseInt(num.toString());
    }




}
