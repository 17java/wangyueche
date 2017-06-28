package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.DriveTimeDistribution;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

/**
 * Created by gaojl on 2017/5/8 13:43.
 * 用车时间分布
 */
@MyBatis
public interface DriveTimeDistributionMapper {
    /**
     *
     * @param companyId
     * @param startDate
     * @param endDate
     * @param timeRange 1到24
     * @return
     */
    DriveTimeDistribution listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate, @Param("timeRange") Integer timeRange);
}
