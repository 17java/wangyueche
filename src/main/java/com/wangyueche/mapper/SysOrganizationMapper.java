package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysOrganizationExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysOrganizationMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    List<SysOrganization> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    SysOrganization selectByPrimaryKey(Long id);

    int updateSelective(@Param("record") SysOrganization record, @Param("param") Map<String, Object> args);

    int update(@Param("record") SysOrganization record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);

    List<SysOrganization> selectByIds(List<Long> idList);
}