package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.OrderStatVo;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/4/27 14:31
 * 企业订单统计
 *
 * @author gaojl
 */
@MyBatis
public interface OrderStatVoMapper {
    List<OrderStatVo> selectOrderCount(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);

    Integer listIndexInfo(@Param("companyId")String companyId,@Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
