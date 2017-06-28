package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 8:58 .
 */
@MyBatis
public interface VehicleBeyondOperateMapper {
    List<OperateDepartArrive> list(@Param("vehicleNo") String vehicleNo, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
