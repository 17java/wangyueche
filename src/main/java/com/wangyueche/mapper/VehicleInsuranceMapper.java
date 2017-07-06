package com.wangyueche.mapper;

import com.wangyueche.bean.entity.VehicleInsurance;
import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@MyBatis
public interface VehicleInsuranceMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<VehicleInsurance> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    VehicleInsurance selectByPrimaryKey(Integer id);

}