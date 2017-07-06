package com.wangyueche.service.impl;

import java.util.Date;
import java.util.List;

import com.wangyueche.bean.entity.SysUserRole;
import com.wangyueche.mapper.SysUserRoleMapper;
import com.wangyueche.service.UserRoleService;
import com.wangyueche.dao.UserRoleDao;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;


	public List<SysUserRole> queryByParam(Long roleId,Long userId){
		Pager pager = new Pager().max();
		pager.setSorts(SysUserRoleMapper.ORDERBY);
		ArgGen argGen = new ArgGen();
		argGen.addPositive("roleId",roleId)
				.addPositive("userId",userId);
		return sysUserRoleMapper.select(pager, argGen.getArgs());
	}

	@Override
	public int insert(SysUserRole sysUserRole) {
		Date date = new Date();
		sysUserRole.setCreateTime(date);
		sysUserRole.setUpdateTime(date);
		return sysUserRoleMapper.insert(sysUserRole);
	}

	@Override
	public int update(SysUserRole sysUserRole) {
		sysUserRole.setUpdateTime(new Date());
		if (sysUserRole.getId() == null){
			throw new RuntimeException("更新失败");
		}
		return sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
	}

	@Override
	public int deleteByUserRole(SysUserRole sysUserRole) {
		return sysUserRoleMapper.deleteByPrimaryKey(sysUserRole.getId());
	}

	@Override
	public int updateByUserId(Long userId, List<Long> roles) {
		SysUserRole sysUserRole = new SysUserRole();
		ArgGen argGen = new ArgGen();
		argGen.addPositive("userId",userId);
		int resultNum=sysUserRoleMapper.delete(argGen.getArgs());
		for (Long rolesId : roles) {
			sysUserRole.setUserId(userId);
			sysUserRole.setRoleId(rolesId);
			sysUserRole.setCreateTime(new Date());
			sysUserRole.setUpdateTime(new Date());
			sysUserRole.setStatusId("1");
			sysUserRoleMapper.insert(sysUserRole);
		}
		return resultNum;
	}
}
