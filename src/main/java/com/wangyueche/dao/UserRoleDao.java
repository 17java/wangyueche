package com.wangyueche.dao;

import java.util.List;

import com.wangyueche.bean.entity.SysUserRole;

/**
 * Created by gaoshiwei on 2017/3/30.
 * 用户-角色Dao
 */
public interface UserRoleDao {
	
	SysUserRole selectById(long id);
 
	List<SysUserRole> selectByUserId(long id);
	//新增方法
	List<SysUserRole> selectByRoleId(long id);

	SysUserRole selectByUserRole(SysUserRole sysUserRole);
	
	int insert(SysUserRole sysUserRole);

	int update(SysUserRole sysUserRole);

	int deleteByUserRole(SysUserRole sysUserRole);
	
	int deleteById(long id);
	
	int deleteByUserId(long userId);
	
}
