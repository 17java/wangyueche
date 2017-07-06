package com.wangyueche.mapper;

import com.wangyueche.bean.entity.CompanyPay;
import com.wangyueche.bean.entity.CompanyPayExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CompanyPayMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<CompanyPay> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    CompanyPay selectByPrimaryKey(Integer id);

}