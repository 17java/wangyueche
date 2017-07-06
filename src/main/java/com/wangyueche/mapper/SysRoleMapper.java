package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysRoleExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysRoleMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    SysRole selectByPrimaryKey(Long id);

    int updateSelective(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    int update(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}