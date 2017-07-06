package com.wangyueche.mapper;

import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.entity.SysUserExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface SysUserMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> select(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

    SysUser selectByPrimaryKey(Long id);

    int updateSelective(@Param("record") SysUser record, @Param("param") Map<String, Object> args);

    int update(@Param("record") SysUser record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}