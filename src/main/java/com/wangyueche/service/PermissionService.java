package com.wangyueche.service;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.bean.vo.TreeNode;
import com.wangyueche.util.base.Page;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
public interface PermissionService {

	SysPermission query(long id);

	int save(SysPermission sysPermission);

	int update(SysPermission sysPermission);

	int delete(long id);
	
	List<SysPermission> listForId(List<Long> idList);
	
	List<SysPermission> list();

	List<SysPermission> listByUserId(Long userId);

	EasyUIResult listForPage(int pageCurrent, int pageSize, String permCondition, String permName, String permValue);

    int deleteByIds(List<Long> ids);

	/**
	 * 根据父节点查询子节点
	 * @param parentId
	 * @return
	 */
	List<TreeNode> getNodeList(Long parentId);
}
