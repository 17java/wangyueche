package com.wangyueche.service.impl;

import com.wangyueche.bean.entity.SysRolePermission;
import com.wangyueche.mapper.SysRolePermissionMapper;
import com.wangyueche.service.RolePermissionService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

	@Autowired
	private SysRolePermissionMapper mapper;

	@Override
	public SysRolePermission query(long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysRolePermission> queryByParam(Long roleId) {
		ArgGen argGen = new ArgGen();
		argGen.addPositive("roleId",roleId);
		return mapper.select(new Pager().max().setSorts(SysRolePermissionMapper.ORDERBY), argGen.getArgs());
	}

	/**
	 * 保存角色和对应权限
	 * @param roleId 角色id
	 * @param permissionList 权限id
	 * @return
	 */
	@Override
	public int save(Long roleId, List<Long> permissionList) {
		//根据角色id删除原有权限
		ArgGen argGen = new ArgGen();
		argGen.addPositive("roleId",roleId);
		mapper.delete(argGen.getArgs());
		//根据权限列表，增加权限
		SysRolePermission sysRolePermission = new SysRolePermission();
		int i = 0;
		for (Long permissionId : permissionList) {
			sysRolePermission.setPermissionId(permissionId);
			sysRolePermission.setRoleId(roleId);
			sysRolePermission.setStatusId("1");
			sysRolePermission.setCreateTime(new Date());
			sysRolePermission.setUpdateTime(new Date());
			mapper.insert(sysRolePermission);
			i++;
		}
		if (permissionList.size() == i) {
			return i;
		}
		return 0;
	}

	@Override
	public int delete(Long roleId) {
		ArgGen argGen = new ArgGen();
		argGen.addPositive("roleId", roleId);
		return mapper.delete(argGen.getArgs());
	}

	@Override
	public int deleteByRolePermission(SysRolePermission sysRolePermission) {
		ArgGen argGen = new ArgGen();
		argGen.addPositive("roleId",sysRolePermission.getRoleId())
				.addPositive("permissionId",sysRolePermission.getPermissionId());
		return mapper.delete(argGen.getArgs());
	}

	@Override
	public int update(Long roleId, List<Long> permissionList) {
		return save(roleId, permissionList);
	}

	@Override
	public List<SysRolePermission> listForRoleId(List<Long> idList) {
		return mapper.selectByIds(idList);
	}
}
