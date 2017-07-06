package com.wangyueche.service;

import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.util.base.Page;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * Created by lyq
 */
public interface RoleService {

	SysRole query(long id);
	
	SysRole queryByRoleName(String roleName);

	int save(SysRole sysRole);

	int update(SysRole sysRole);

	int delete(long id);

	EasyUIResult listForPage(Pager pager, String startDate,String endDate, String roleName);
	
	List<SysRole> listForId(List<Object> idList);

	List<SysRole> list();

	int deleteByIds(List<Object> ids);
}
