package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.DriverReputationStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/5/8 14:12.
 */
@MyBatis
public interface DriverReputationStatMapper {
    List<DriverReputationStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
