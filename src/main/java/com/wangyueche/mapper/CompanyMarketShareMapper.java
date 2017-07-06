package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.CompanyMarketShare;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 平台市场占有率mapper
 * @author lyq
 */
@MyBatis
public interface CompanyMarketShareMapper {
    List<CompanyMarketShare> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
