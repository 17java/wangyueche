package com.wangyueche.service.impl;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mapper.SysRoleMapper;
import com.wangyueche.service.RoleService;
import com.wangyueche.dao.RoleDao;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private SysRoleMapper mapper;

	@Override
	public SysRole query(long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int save(SysRole sysRole) {
		Date date = new Date();
		sysRole.setCreateTime(date);
		sysRole.setUpdateTime(date);
		sysRole.setStatusId("1");
		return mapper.insertSelective(sysRole);
	}

	@Override
	public int update(SysRole sysRole) {
		sysRole.setUpdateTime(new Date());
		return mapper.updateByPrimaryKeySelective(sysRole);
	}

	@Override
	public int delete(long id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public EasyUIResult listForPage(Pager pager, String startDate, String endDate,String roleName) {

		ArgGen argGen = new ArgGen();
		argGen.addNotEmpty("roleName",roleName);
		pager.setSorts(SysRoleMapper.ORDERBY);

		List<SysRole> list = mapper.select(pager, argGen.getArgs());
		PageInfo<SysRole> pageInfo = new PageInfo<>(list);
		EasyUIResult easyUIResult = new EasyUIResult();
		easyUIResult.setTotal(pageInfo.getTotal());
		easyUIResult.setRows(pageInfo.getList());
		return easyUIResult;
	}

	@Override
	public List<SysRole> list() {
		ArgGen argGen = new ArgGen();
		Pager pager = new Pager().max();
		pager.setSorts(SysRoleMapper.ORDERBY);
		return mapper.select(pager, argGen.getArgs());
	}

	@Override
	public SysRole queryByRoleName(String roleName) {
		ArgGen argGen = new ArgGen();
		argGen.addNotEmpty("roleName",roleName);
		Pager pager = new Pager().max();
		pager.setSorts(SysRoleMapper.ORDERBY);
		List<SysRole> resultData = mapper.select(pager, argGen.getArgs());
		if (resultData.size() < 1) {
			return null;
		}
		return resultData.get(0);
	}

	@Override
	public List<SysRole> listForId(List<Object> idList) {
		ArgGen argGen = new ArgGen();
		argGen.addIn("idLists", idList);
		Pager pager = new Pager().max();
		pager.setSorts(SysRoleMapper.ORDERBY);
		return mapper.select(pager, argGen.getArgs());
	}

	@Override
	public int deleteByIds(List<Object> idLists) {
		ArgGen argGen = new ArgGen();
		argGen.addIn("idLists", idLists);
		Pager pager = new Pager().max();
		pager.setSorts(SysRoleMapper.ORDERBY);
		return mapper.delete(argGen.getArgs());
	}
}
