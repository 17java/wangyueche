package com.wangyueche.dao;

import com.wangyueche.bean.entity.SysPermission;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 * 权限Dao
 */
public interface PermissionDao {

	SysPermission selectById(long id);

	int insert(SysPermission permission);

	int update(SysPermission permission);

	int deleteById(long id);

	List<SysPermission> listForId(List<Long> idList);
	
	List<SysPermission> list();

	List<SysPermission> listByUserId(Long userId);

	List<SysPermission> listForPage(int pageCurrent, int pageSize, String permCondition, String permName, String permValue);

    int deleteByIds(List<Long> ids);

	/**
	 * 根据父节点查询权限
	 * @param parentId
	 * @return
	 */
	List<SysPermission> slectByParentId(Long parentId);
}
