package com.wangyueche.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.TreeNode;
import com.wangyueche.service.PermissionService;
import com.wangyueche.dao.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionDao dao;

	@Override
	public SysPermission query(long id) {
		return dao.selectById(id);
	}

	@Override
	public int save(SysPermission sysPermission) {
		return dao.insert(sysPermission);
	}

	@Override
	public int update(SysPermission sysPermission) {
		return dao.update(sysPermission);
	}

	@Override
	public int delete(long id) {
		return dao.deleteById(id);
	}

	/**
	 * 新增于  2017年4月5日10:02:13 By Gaojl
	 * @param pageCurrent 当前页
	 * @param pageSize 页面记录数大小
	 * @param permCondition 权限名称查询条件
	 * @param permName 权限名称
	 * @param permValue 权限值
	 * @return
	 */
	@Override
	public EasyUIResult listForPage(int pageCurrent, int pageSize, String permCondition, String permName, String permValue) {
		List<SysPermission> list = dao.listForPage(pageCurrent, pageSize, permCondition, permName, permValue);
		PageInfo<SysPermission> pageInfo = new PageInfo<>(list);
		EasyUIResult result = new EasyUIResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(pageInfo.getList());
		return result;
	}

	@Override
	public int deleteByIds(List<Long> ids) {
		return dao.deleteByIds(ids);
	}

	@Override
	public List<SysPermission> listForId(List<Long> idList) {
		return dao.listForId(idList);
	}

	@Override
	public List<SysPermission> list() {
		return dao.list();
	}

	@Override
	public List<SysPermission> listByUserId(Long userId) {
		return dao.listByUserId(userId);
	}

	/**
	 * 根据父节点查询子节点
	 *
	 * @param parentId
	 * @return
	 */
	@Override
	public List<TreeNode> getNodeList(Long parentId) {
		List<SysPermission> permissionsList = dao.slectByParentId(parentId);
		List<TreeNode> treeNodeList = new ArrayList<>();
		if (permissionsList.size() > 0) {
			for (SysPermission permission : permissionsList) {
				TreeNode node = new TreeNode(permission.getId(), permission.getPermissionName(), permission.getIsParent() ? "closed" : "open");
				treeNodeList.add(node);
			}
		}
		return treeNodeList;
	}
}
