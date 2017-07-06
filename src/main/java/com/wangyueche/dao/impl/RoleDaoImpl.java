package com.wangyueche.dao.impl;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysRoleExample;
import com.wangyueche.dao.RoleDao;
import com.wangyueche.util.base.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


@Repository
public class RoleDaoImpl implements RoleDao {
	@Override
	public SysRole selectById(long id) {
		return null;
	}

	@Override
	public SysRole selectByRoleName(String roleName) {
		return null;
	}

	@Override
	public int insert(SysRole role) {
		return 0;
	}

	@Override
	public int update(SysRole role) {
		return 0;
	}

	@Override
	public int deleteById(long id) {
		return 0;
	}

	@Override
	public List<SysRole> listForPage(int pageCurrent, int pageSize, String startDate, String endDate, String roleName) {
		return null;
	}

	@Override
	public List<SysRole> listForId(List<Long> idList) {
		return null;
	}

	@Override
	public List<SysRole> list() {
		return null;
	}

	@Override
	public int deleteByIds(List<Long> ids) {
		return 0;
	}

	/*@Autowired
	private SysRoleMapper mapper;

	@Override
	public SysRole selectById(long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(SysRole sysRole) {
		Date date = new Date();
		sysRole.setCreateTime(date);
		sysRole.setUpdateTime(date);
		return mapper.insertSelective(sysRole);
	}

	@Override
	public int update(SysRole sysRole) {
		sysRole.setUpdateTime(new Date());
		return mapper.updateByPrimaryKeySelective(sysRole);
	}

	@Override
	public int deleteById(long id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SysRole> listForPage(int pageCurrent, int pageSize, String startDate,String endDate, String roleName) {
		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();
		if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
			//确认此处是否只有一个时间
			if (startDate.equals(endDate)) {
				Date time = SqlUtil.formatterDate(startDate);
				criteria.andUpdateTimeBetween(time, SqlUtil.addDay(time, 1));
			}
			Date startTime = SqlUtil.formatterDate(startDate);
			Date endTime = SqlUtil.formatterDate(endDate);

			criteria.andUpdateTimeBetween(startTime, endTime);
			//Date endtime = SqlUtil.formatterDate(date2);
		}
		if (StringUtils.hasText(roleName)) {
			criteria.andRoleNameLike(SqlUtil.like(roleName));
		}
		int totalCount = mapper.countByExample(example);
		pageSize = SqlUtil.checkPageSize(pageSize);
		pageCurrent = SqlUtil.checkPageCurrent(totalCount, pageSize, pageCurrent);
		int totalPage = SqlUtil.countTotalPage(totalCount, pageSize);
		//
		PageHelper.startPage(pageCurrent,pageSize);

		List<SysRole> list = mapper.selectByExample(example);
		return list;
	}

	@Override
	public List<SysRole> list() {
		SysRoleExample example = new SysRoleExample();
		return mapper.selectByExample(example);
	}

	@Override
	public SysRole selectByRoleName(String roleName) {
		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleNameEqualTo(roleName);
		List<SysRole> resultData = mapper.selectByExample(example);
		if (resultData.size() < 1) {
			return null;
		}
		return resultData.get(0);
	}

	@Override
	public List<SysRole> listForId(List<Long> idList) {
		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(idList);
		return mapper.selectByExample(example);
	}

	@Override
	public int deleteByIds(List<Long> ids) {
		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		return mapper.deleteByExample(example);
	}*/
}
