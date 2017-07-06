package com.wangyueche.service;

import com.wangyueche.bean.entity.SysUserRole;

import java.util.List;

/**
 * Created by lyq
 */
public interface UserRoleService {

	List<SysUserRole> queryByParam(Long roleId,Long userId);

	int insert(SysUserRole sysUserRole);

	int update(SysUserRole sysUserRole);

	int updateByUserId(Long userId, List<Long> roles);
	
	int deleteByUserRole(SysUserRole sysUserRole);
}
