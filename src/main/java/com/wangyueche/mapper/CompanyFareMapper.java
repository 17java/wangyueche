package com.wangyueche.mapper;

import com.wangyueche.bean.entity.CompanyFare;
import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@MyBatis
public interface CompanyFareMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<CompanyFare> select(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

    CompanyFare selectByPrimaryKey(Integer id);

}