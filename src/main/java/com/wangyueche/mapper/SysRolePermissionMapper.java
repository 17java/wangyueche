package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysRolePermission;
import com.wangyueche.bean.entity.SysRolePermissionExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysRolePermissionMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    List<SysRolePermission> selectByIds(List<Long> ids);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateSelective(@Param("record") SysRolePermission record, @Param("param") Map<String, Object> args);

    int update(@Param("record") SysRolePermission record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}