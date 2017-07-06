package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysPermissionExample;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.TreeNode;
import com.wangyueche.mapper.SysPermissionMapper;
import com.wangyueche.service.PermissionService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private SysPermissionMapper sysPermissionMapper;

	@Override
	public SysPermission query(long id) {
		return sysPermissionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int save(SysPermission sysPermission) {
		Date date = new Date();
		sysPermission.setCreateTime(date);
		sysPermission.setUpdateTime(date);
		return sysPermissionMapper.insertSelective(sysPermission);
	}

	@Override
	public int update(SysPermission sysPermission) {
		sysPermission.setUpdateTime(new Date());
		return sysPermissionMapper.updateByPrimaryKeySelective(sysPermission);
	}

	@Override
	public int delete(long id) {
		return sysPermissionMapper.deleteByPrimaryKey(id);
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

		ArgGen args = new ArgGen();
		args.addLike("permName", permName)
			.addLike("permValue", permValue);
		//设置分页
		int totalCount = sysPermissionMapper.countByExample(args.getArgs());
		/*pageSize = SqlUtil.checkPageSize(pageSize);
		pageCurrent = SqlUtil.checkPageCurrent(totalCount, pageSize, pageCurrent);
		int totalPage = SqlUtil.countTotalPage(totalCount, pageSize);

		PageHelper.startPage(pageCurrent, pageSize);*/
		Pager pager = new Pager(pageCurrent,pageSize);
		pager.setSorts(SysPermissionMapper.ORDERBY);
		//处理查询结果
		List<SysPermission> list = sysPermissionMapper.selectByExample(pager, args.getArgs());

		PageInfo<SysPermission> pageInfo = new PageInfo<>(list);
		EasyUIResult result = new EasyUIResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(pageInfo.getList());
		return result;
	}

	@Override
	public int deleteByIds(List<Object> ids) {
		ArgGen args = new ArgGen();
		args.addIn("ids", ids);
		return sysPermissionMapper.deleteByExample(args.getArgs());
	}

	@Override
	public List<SysPermission> listForId(List<Object> ids) {
		ArgGen args = new ArgGen();
		args.addIn("ids", ids);
		Pager pager = new Pager();
		pager.setSorts(SysPermissionMapper.ORDERBY);
		pager.max();
		return sysPermissionMapper.selectByExample(pager, args.getArgs());
	}

	@Override
	public List<SysPermission> list() {
		ArgGen args = new ArgGen();
		Pager pager = new Pager();
		pager.setSorts(SysPermissionMapper.ORDERBY);
		pager.max();
		return sysPermissionMapper.selectByExample(pager, args.getArgs());
	}

	@Override
	public List<SysPermission> listByUserId(Long userId) {
		return sysPermissionMapper.selectByUserId(userId);
	}

	/**
	 * 根据父节点查询子节点
	 *
	 * @param parentId
	 * @return
	 */
	@Override
	public List<TreeNode> getNodeList(Long parentId) {
		ArgGen args = new ArgGen();
		args.addPositive("parentId", parentId);
		Pager pager = new Pager();
		pager.setSorts(SysPermissionMapper.ORDERBY);
		pager.max();
		List<SysPermission> permissionsList = sysPermissionMapper.selectByExample(pager, args.getArgs());

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
