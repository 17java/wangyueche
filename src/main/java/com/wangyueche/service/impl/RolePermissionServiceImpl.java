package com.wangyueche.service.impl;

import java.util.List;

import com.wangyueche.bean.entity.SysRolePermission;
import com.wangyueche.service.RolePermissionService;
import com.wangyueche.dao.RolePermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

	@Autowired
	private RolePermissionDao dao;

	@Override
	public SysRolePermission query(long id) {

		return dao.selectById(id);
	}

	@Override
	public List<SysRolePermission> queryByRoleId(long id) {

		return dao.selectByRoleId(id);
	}

	/**
	 * 保存角色和对应权限
	 * @param roleId 角色id
	 * @param permissionList 权限id
	 * @return
	 */
	@Override
	public int save(long roleId, List<Long> permissionList) {
		//根据角色id删除原有权限
		dao.deleteByRoleId(roleId);
		//根据权限列表，增加权限
		SysRolePermission sysRolePermission = new SysRolePermission();
		int i = 0;
		for (Long permissionId : permissionList) {
			sysRolePermission.setPermissionId(permissionId);
			sysRolePermission.setRoleId(roleId);
			dao.insert(sysRolePermission);
			i++;
		}
		if (permissionList.size() == i) {
			return i;
		}
		return 0;
	}

	@Override
	public int delete(long roleId) {

		return dao.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByRolePermission(SysRolePermission sysRolePermission) {
		return dao.delectByRolePermission(sysRolePermission);
	}

	@Override
	public int update(long roleId, List<Long> permissionList) {

		return save(roleId, permissionList);
	}

	@Override
	public List<SysRolePermission> listForRoleId(List<Long> idList) {

		return dao.listForRoleId(idList);
	}
}
