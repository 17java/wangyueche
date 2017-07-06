package com.wangyueche.mapper;

import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.entity.CompanyInfoExample;
import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CompanyInfoMapper {

    int countByExample(@Param("param") Map<String, Object> args);

    int deleteByExample(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    List<CompanyInfo> selectByExample(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

    List<CompanyInfo> list(@Param("pager") Pager pager);

    CompanyInfo selectByPrimaryKey(Integer id);

    int infom(@Param("record") CompanyInfo record, @Param("param") Map<String, Object> args);

    int updateByExample(@Param("record") CompanyInfo record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}