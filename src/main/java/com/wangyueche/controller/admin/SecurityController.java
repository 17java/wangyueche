package com.wangyueche.controller.admin;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.SysUserVo;
import com.wangyueche.biz.UserBiz;
import com.wangyueche.service.UserService;
import com.wangyueche.util.base.BaseController;
import com.wangyueche.util.base.ParamUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping(value = "/admin/security/", method = RequestMethod.POST)
public class SecurityController extends BaseController {

	@Autowired
	private UserBiz biz;

	@Autowired
	private UserService service;

	@RequestMapping(value = LIST, method = RequestMethod.GET)
	public void list() {

	}

	/*//返回角色信息
	@RequestMapping(value = ADD, method = RequestMethod.GET)
	@ResponseBody
	public void add(ModelMap modelMap) {
		List<SysRole> resultRole = biz.queryRoleList();
		if (resultRole.size()>0) {
			modelMap.put("roles", resultRole);
		}
	}*/

	/**
	 * 分页查询
	 *
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = PAGE)
	public EasyUIResult queryForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int pageSize, @RequestParam(value = "organizationId", required = false) Long organizationId, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "staffNo", required = false) String staffNo,@RequestParam(value = "organizationName",required = false)String organizationName) {
		EasyUIResult result = biz.listForPage(page, pageSize, organizationId, name, staffNo,organizationName);
		System.out.println("page:" + page + "pageSize:" + pageSize + "total: " + result.getTotal());
		if (result!=null) {
			return result;
		}
		return new EasyUIResult();
	}

	@RequestMapping(value = VIEW, method = RequestMethod.GET)
	@ResponseBody
	public SysUserVo view(long id) {
		SysUserVo result = biz.query(id);
		if (result!=null) {
			return result;
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "permission",method = RequestMethod.GET)
	public List<SysPermission> queryUserPermission(){
		SysUser user = biz.queryByUserNo(SecurityUtils.getSubject().getPrincipal().toString());
		if (user != null){
			//获取角色
			List<SysRole> userRoles = biz.queryRoles(user.getId());
			//获取权限
			List<SysPermission> userPermissions = biz.queryPermissions(userRoles);
			return userPermissions;
		}
		return null;
	}

	/*@RequestMapping(value = EDIT, method = RequestMethod.GET)
	public void edit(ModelMap modelMap, long id) {
		SysUserVo result = biz.query(id);
		if (result!=null) {
			modelMap.put("bean", result);
		}
		List<SysRole> resultRole = biz.queryRoleList();
		if (resultRole.size()>0) {
			modelMap.put("roles", resultRole);
		}
	}*/

	@RequestMapping(value = SAVE)
	@ResponseBody
	public String save(SysUser sysUser, @RequestParam(value = "role", required = false) String role) {
		List<Long> roles = ParamUtil.toLongList(role, ",");
		int result = biz.save(sysUser, roles);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	@RequestMapping(value = DELETE, method = RequestMethod.GET)
	@ResponseBody
	public String delete(long id) {
		int result = biz.delete(id);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	@ResponseBody
	@RequestMapping(value = UPDATE)
	public String update(SysUser sysUser, @RequestParam(value = "role", required = false) String role) {
		List<Long> roles = ParamUtil.toLongList(role, ",");
		int result = biz.update(sysUser, roles);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	@ResponseBody
	@RequestMapping(value = "securityList",method = RequestMethod.GET)
	public List<SysUser> securityList() {
		return service.list();
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

    /**
     * 判断用户名是否存在
     * @param name 用户name
	 * @param email 用户邮箱
     * @return
     */
	@ResponseBody
	@RequestMapping(value = "checkUser")
	public String checkName(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "email",required = false) String email) {
		List<SysUser> list = service.selectByNameEmail(name,email);
		if (list.size() > 0) {
			//用户存在
			return list.get(0).getId() + "";
		}
		//用户不存在
		return "false";
	}

}
