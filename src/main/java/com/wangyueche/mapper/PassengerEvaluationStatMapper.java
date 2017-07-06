package com.wangyueche.mapper;

import com.wangyueche.bean.vo.statistics.PassengerEvaluationStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lyq
 *
 * @author gaojl
 */
@MyBatis
public interface PassengerEvaluationStatMapper {
    List<PassengerEvaluationStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
