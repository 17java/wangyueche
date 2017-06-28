package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.VehicleBeyondOperateStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/5/8 13:14.
 */
@MyBatis
public interface VehicleBeyondOperateStatMapper {
    List<VehicleBeyondOperateStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
