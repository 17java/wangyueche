package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.VehicleOperateStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lyq
 *
 */
@MyBatis
public interface VehicleOperateStatMapper {
    List<VehicleOperateStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);

    /**
     * 查找指定时间段内的车辆数
     */
    Integer count(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
