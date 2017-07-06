package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.VehicleBeyondOperateStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lyq
 */
@MyBatis
public interface VehicleBeyondOperateStatMapper {
    List<VehicleBeyondOperateStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
