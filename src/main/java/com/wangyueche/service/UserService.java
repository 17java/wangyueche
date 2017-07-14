package com.wangyueche.service;

import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * Created by lyq
 */
public interface UserService {

	SysUser login(String userno, String password);

	EasyUIResult listForPage(Pager pager, Long organizationId, String name, String staffNo,String organizationName);

	SysUser query(long id);

	SysUser queryByUserNo(String userno);

	int save(SysUser sysUser);

	int update(SysUser sysUser);

	int delete(long id);

	SysUser queryByOrganizationId(long id);

	List<SysUser> listForId(List<Long> uidList);

	List<SysUser> selectByName(String name);

	List<SysUser> list();

	int deleteByIds(List<Long> ids);

	/**
	 * 根据负责人姓名和邮箱查询负责人
	 * @param name
	 * @param email
	 * @return
	 */
	List<SysUser> selectByNameEmail(String name,String email);
}
