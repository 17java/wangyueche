package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysPermissionExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysPermissionMapper {

    String[] ORDERBY = {"create_time"};

    int countByExample(@Param("param") Map<String, Object> args);

    int deleteByExample(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    List<SysPermission> selectByUserId(Long userId);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("param") Map<String, Object> args);

    int updateByExample(@Param("record") SysPermission record,@Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}