package com.wangyueche.service;

import com.wangyueche.bean.entity.SysRolePermission;
import com.wangyueche.bean.vo.Result;

import java.util.List;

/**
 * Created by lyq
 */
public interface RolePermissionService {

	SysRolePermission query(long id);

	List<SysRolePermission> queryByParam(Long roleId);

	int save(Long roleId, List<Long> permissionList);

	int update(Long roleId, List<Long> permissionList);
	
	int delete(Long roleId);

	int deleteByRolePermission(SysRolePermission sysRolePermission);
	
	List<SysRolePermission> listForRoleId(List<Long> idList);

}
