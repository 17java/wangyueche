package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.OrderStatVo;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/27 14:31
 * 企业订单统计
 *
 * @author lyq
 */
@MyBatis
public interface OrderStatVoMapper {
    List<OrderStatVo> listOrder(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);

    Integer count(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
