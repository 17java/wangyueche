package com.wangyueche.biz;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.service.PermissionService;
import com.wangyueche.util.base.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PermissionBiz {

	@Autowired
	private PermissionService permissionService;

	public SysPermission query(long id) {
		return permissionService.query(id);
	}

	public int save(SysPermission sysPermission) {
		return permissionService.save(sysPermission);
	}
	

	public int delete(long id) {
		return permissionService.delete(id);
	}

	public int update(SysPermission sysPermission) {
		return permissionService.update(sysPermission);
	}

	public EasyUIResult listForPage(int pageCurrent, int pageSize, String permCondition, String permName, String permValue) {
		return permissionService.listForPage(pageCurrent, pageSize, permCondition, permName, permValue);
	}

	public int deletByIds(List<Object> ids) {
		return permissionService.deleteByIds(ids);
	}
}
