package com.wangyueche.mapper;

import com.wangyueche.bean.vo.share.ShareEfficiencyStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lyq
 */
@MyBatis
public interface ShareEfficiencyStatMapper {
    List<ShareEfficiencyStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
