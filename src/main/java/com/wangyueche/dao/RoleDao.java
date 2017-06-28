package com.wangyueche.dao;

import com.wangyueche.bean.entity.SysRole;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 * 角色Dao
 */
public interface RoleDao {

	SysRole selectById(long id);

	SysRole selectByRoleName(String roleName);

	int insert(SysRole role);

	int update(SysRole role);

	int deleteById(long id);

	List<SysRole> listForPage(int pageCurrent, int pageSize, String startDate,String endDate, String roleName);
	
	List<SysRole> listForId(List<Long> idList);

	List<SysRole> list();

	int deleteByIds(List<Long> ids);
}
