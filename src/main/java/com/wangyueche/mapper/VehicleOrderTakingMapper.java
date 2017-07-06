package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.VehicleOrderTaking;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author lyq
 */
@MyBatis
public interface VehicleOrderTakingMapper {
    VehicleOrderTaking listByOrderAmount(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate, @Param("min") Integer min, @Param("max") Integer max);
}
