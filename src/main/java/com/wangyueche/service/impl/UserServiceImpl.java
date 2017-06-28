package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.UserService;
import com.wangyueche.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public SysUser login(String userno, String password) {
		SysUser user = dao.selectUser(userno, password);
		return user;
	}

	@Override
	public SysUser queryByUserNo(String userno) {
		SysUser user = dao.selectByUserNo(userno);
		return user;
	}

	@Override
	public int save(SysUser sysUser) {
		SysUser user = dao.selectByUserNo(sysUser.getUserNo());
		int resultNum = -1;
		if (user == null) {
			resultNum = dao.insert(sysUser);
		}
		return resultNum;
	}

	@Override
	public int update(SysUser sysUser) {
		int resultNum = dao.update(sysUser);
		return resultNum;
	}

	@Override
	public int delete(long id) {
		int resultNum = dao.deleteById(id);
		return resultNum;
	}

	@Override
	public SysUser queryByOrganizationId(long id) {
		SysUser sysUser = dao.selectByOrganizationId(id);
		return sysUser;
	}

	@Override
	public EasyUIResult listForPage(int pageCurrent, int pageSize, Long organizationId, String name, String staffNo,String organizationName) {
		List<SysUser> list = dao.listForPage(pageCurrent, pageSize, organizationId, name, staffNo,organizationName);

		PageInfo<SysUser> pageInfo = new PageInfo<>(list);

		EasyUIResult result = new EasyUIResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(pageInfo.getList());
		return result;
	}

	@Override
	public SysUser query(long id) {
		SysUser sysUser= dao.select(id);
		return sysUser;
	}
	@Override
	public List<SysUser> listForId(List<Long> uidList) {
		List<SysUser> list = dao.listForId(uidList);
		return list;
	}

	@Override
	public List<SysUser> selectByName(String name) {
		List<SysUser> list = dao.selectByName(name, true);
		return list;
	}

	@Override
	public List<SysUser> list() {
		return dao.list();
	}

	@Override
	public int deleteByIds(List<Long> ids) {
		return dao.deleteByIds(ids);
	}

	/**
	 * 根据负责人姓名和邮箱查询负责人
	 *
	 * @param name
	 * @param email
	 * @return
	 */
	@Override
	public List<SysUser> selectByNameEmail(String name, String email) {
		return dao.selectByNameEmail(name, email);
	}
}
