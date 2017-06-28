package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.OrderStatVo;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/5/16 10:38 .
 * 合乘汽车订单统计
 */
@MyBatis
public interface ShareOrderStatMapper {
    List<OrderStatVo> listOrderStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
