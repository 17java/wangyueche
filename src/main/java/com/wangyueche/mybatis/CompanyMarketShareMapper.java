package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.statistics.CompanyMarketShare;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/4/28 22:12
 * 平台市场占有率mapper
 * @author gaojl
 */
@MyBatis
public interface CompanyMarketShareMapper {
    List<CompanyMarketShare> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
