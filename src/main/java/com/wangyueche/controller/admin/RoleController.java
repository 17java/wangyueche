package com.wangyueche.controller.admin;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.SysRoleVo;
import com.wangyueche.biz.RoleBiz;
import com.wangyueche.service.RoleService;
import com.wangyueche.util.base.BaseController;
import com.wangyueche.util.base.ParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/admin/role/", method = RequestMethod.POST)
public class RoleController extends BaseController {

	@Autowired
	private RoleBiz biz;

	@Autowired
	private RoleService service;

	@RequestMapping(value = LIST, method = RequestMethod.GET)
	public void list() {

	}

	/**
	 * 分页查询
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = PAGE)
	public EasyUIResult queryForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int pageSize, @RequestParam(value = "startDate", required = false) String startDate, @RequestParam(value = "endDate",required = false) String endDate,@RequestParam(value = "roleName", required = false) String roleName) {
		EasyUIResult result = biz.listForPage(page, pageSize, startDate, endDate, roleName);
		if (result!=null) {
			return result;
		}
		return null;
	}


	@RequestMapping(value = ADD, method = RequestMethod.GET)
	public void add(ModelMap modelMap) {
		List<SysPermission> resultPermission = biz.queryPermissionList();
		if (resultPermission.size()>0) {
			modelMap.put("permissions", resultPermission);
		}
	}
	/**
	 * 新增角色
	 * @param sysRole
	 * @param permission
	 */
	@RequestMapping(value = SAVE)
	@ResponseBody
	public String save(SysRole sysRole, String permission) {

		List<Long> permissions = ParamUtil.toLongList(permission, ",");
		int result = biz.save(sysRole, permissions);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	/**
	 *角色详情
	 * @param
	 * @param id
	 */
	@ResponseBody
	@RequestMapping(value = VIEW, method = RequestMethod.GET)
	public SysRoleVo view(long id) {
		SysRoleVo result = biz.query(id);
		if (result != null) {
			return result;
		}
		return null;
	}

	@RequestMapping(value = EDIT, method = RequestMethod.GET)
	public void edit(ModelMap modelMap, long id) {
		SysRoleVo result = biz.query(id);
		if (result!=null) {
			modelMap.put("bean", result);
		}

		List<SysPermission> resultPermission = biz.queryPermissionList();
		if (resultPermission.size()>0) {
			modelMap.put("permissions", resultPermission);
		}
	}

	/**
	 * 修改角色信息，目前SQL语句与新建角色相同
	 * @param sysRole
	 * @param permission
	 * @return
	 */
	@RequestMapping(value = UPDATE)
	@ResponseBody
	public String update(SysRole sysRole, String permission) {
		List<Long> permissions = ParamUtil.toLongList(permission, ",");
		int result = biz.update(sysRole, permissions);
		if (result>0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	/**
	 * 通过id 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = DELETE, method = RequestMethod.GET)
	@ResponseBody
	public String delete(long id) {
		int result = biz.delete(id);
		if(result>0){
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	@ResponseBody
	@RequestMapping(value = "roleList", method = RequestMethod.GET)
	public List<SysRole> roleList() {
		List<SysRole> list = service.list();
		if (list.size() < 1) {
			return null;
		}
		return list;
	}

	@ResponseBody
	@RequestMapping(value = "delChecked")
	public int delChecked(@RequestParam(value = "checkedId[]") String[] checkedIdString) {
		try {
			Long[] ids = new Long[checkedIdString.length];
			for(int i=0;i<checkedIdString.length;i++) {
				ids[i] = Long.parseLong(checkedIdString[i]);
			}
			return service.deleteByIds(Arrays.asList(ids));
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
