package com.wangyueche.mapper;

import com.wangyueche.bean.entity.CompanyPermit;
import com.wangyueche.bean.entity.CompanyPermitExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CompanyPermitMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyPermit record);

    int insertSelective(CompanyPermit record);

    List<CompanyPermit> selectByExample(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    CompanyPermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyPermit record, @Param("param") Map<String, Object> args);

    int updateByExample(@Param("record") CompanyPermit record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(CompanyPermit record);

    int updateByPrimaryKey(CompanyPermit record);
}