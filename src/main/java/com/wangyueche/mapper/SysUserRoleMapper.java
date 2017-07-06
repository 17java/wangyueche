package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysUserRole;
import com.wangyueche.bean.entity.SysUserRoleExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysUserRoleMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> select(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

    SysUserRole selectByPrimaryKey(Long id);

    int updateSelective(@Param("record") SysUserRole record, @Param("param") Map<String, Object> args);

    int update(@Param("record") SysUserRole record,@Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}