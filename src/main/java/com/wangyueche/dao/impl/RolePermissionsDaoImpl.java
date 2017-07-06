package com.wangyueche.dao.impl;

import java.util.Date;
import java.util.List;

import com.wangyueche.bean.entity.SysRolePermission;
import com.wangyueche.bean.entity.SysRolePermissionExample;
import com.wangyueche.dao.RolePermissionDao;
import com.wangyueche.mapper.SysRolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RolePermissionsDaoImpl implements RolePermissionDao {
	@Override
	public SysRolePermission selectById(long id) {
		return null;
	}

	@Override
	public List<SysRolePermission> selectByRoleId(long id) {
		return null;
	}

	@Override
	public int insert(SysRolePermission sysRolePermission) {
		return 0;
	}

	@Override
	public int update(SysRolePermission sysRolePermission) {
		return 0;
	}

	@Override
	public int delectByRolePermission(SysRolePermission sysRolePermission) {
		return 0;
	}

	@Override
	public int deleteByRoleId(long roleId) {
		return 0;
	}

	@Override
	public int countByRoleId(long roleId) {
		return 0;
	}

	@Override
	public List<SysRolePermission> listForRoleId(List<Long> idList) {
		return null;
	}

	/*@Autowired
	private SysRolePermissionMapper mapper;

	@Override
	public List<SysRolePermission> selectByRoleId(long id) {
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(id);
		return mapper.selectByExample(example);
	}

	@Override
	public int insert(SysRolePermission sysRolePermission) {
		Date date = new Date();
		sysRolePermission.setCreateTime(date);
		sysRolePermission.setUpdateTime(date);
		return mapper.insertSelective(sysRolePermission);
	}

	@Override
	public int update(SysRolePermission sysRolePermission) {
		sysRolePermission.setUpdateTime(new Date());
		return mapper.updateByPrimaryKeySelective(sysRolePermission);
	}

	@Override
	public int delectByRolePermission(SysRolePermission sysRolePermission) {
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(sysRolePermission.getRoleId());
		criteria.andPermissionIdEqualTo(sysRolePermission.getPermissionId());
		return mapper.deleteByExample(example);
	}

	@Override
	public SysRolePermission selectById(long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteByRoleId(long roleId) {
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		return mapper.deleteByExample(example);
	}

	@Override
	public int countByRoleId(long roleId) {
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		return mapper.countByExample(example);
	}

	@Override
	public List<SysRolePermission> listForRoleId(List<Long> idList) {
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdIn(idList);
		return mapper.selectByExample(example);
	}*/
}
