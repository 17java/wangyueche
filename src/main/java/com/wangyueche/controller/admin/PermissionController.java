package com.wangyueche.controller.admin;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.TreeNode;
import com.wangyueche.biz.PermissionBiz;
import com.wangyueche.biz.UserBiz;
import com.wangyueche.service.PermissionService;
import com.wangyueche.util.base.BaseController;
import com.wangyueche.util.base.Page;
import com.wangyueche.util.base.PageBean;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import javax.swing.*;

@Controller
@RequestMapping(value = "/admin/permission/", method = RequestMethod.POST)
public class PermissionController extends BaseController {

	@Autowired
	private PermissionBiz biz;

	@Autowired
	private UserBiz userBiz;

	@Autowired
	private PermissionService service;

	@RequestMapping(value = LIST, method = RequestMethod.GET)
	public void list() {

	}

	/**
	 * 分页查询
	 * 修改于 2017年4月5日11:33:17 By Gaojl
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = PAGE)
	public EasyUIResult queryForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int pageSize, @RequestParam(value = "permissionCondition" ,required = false) String permissionCondition, @RequestParam(value = "permissionName", required = false) String permissionName, @RequestParam(value = "permissionValue",required = false) String permissionValue) {
		EasyUIResult result = biz.listForPage(page, pageSize, permissionCondition, permissionName, permissionValue);
			return result;
	}

	@RequestMapping(value = ADD, method = RequestMethod.GET)
	public void add() {

	}

	/**
	 * 保存
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = SAVE)
	public String save(SysPermission sysPermission) {
		/*SysPermission sysPermission = new SysPermission();
		sysPermission.setPermissionName(permissionName);
		sysPermission.setPermissionValue(permissionValue);
		sysPermission.setStatusId(status);
		System.out.println(sysPermission);*/
		int result = biz.save(sysPermission);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = DELETE, method = RequestMethod.GET)
	public String delete(long id) {
		int result = biz.delete(id);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}
	
	/**
	 * 明细查询
	 * 
	 * @param modelMap
	 * @param id
	 */
	@ResponseBody
	@RequestMapping(value = VIEW, method = RequestMethod.GET)
	public SysPermission view(ModelMap modelMap, long id) {
		SysPermission result = biz.query(id);
		if (result != null) {
			return result;
		}
		return null;
	}

	/**
	 * 编辑权限
	 * 
	 * @param modelMap
	 * @param id
	 */
	/*@RequestMapping(value = EDIT, method = RequestMethod.GET)
	public void edit(ModelMap modelMap, long id) {
		SysPermission result = biz.query(id);
		if (result!=null) {
			modelMap.put("bean", result);
		}
	}*/

	/**
	 * 更新权限
	 * 
	 * @param sysPermission
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = UPDATE)
	public String update(SysPermission sysPermission) {
		int result = biz.update(sysPermission);
		if (result > 0) {
			return StateCode.SUCEESS;
		}
		return StateCode.ERROR;
	}

	@ResponseBody
    @RequestMapping(value = "delChecked")
    public int delChecked(@RequestParam(value = "checkedId[]") String[] checkedIdString) {
		try {
			Long[] ids = new Long[checkedIdString.length];
			for(int i=0;i<checkedIdString.length;i++) {
				ids[i] = Long.parseLong(checkedIdString[i]);
			}
			return biz.deletByIds(Arrays.asList(ids));
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
    }

    @ResponseBody
	@RequestMapping(value = "permissionList",method = RequestMethod.GET)
    public List<SysPermission> permissionList() {
		return service.list();
	}

	@ResponseBody
	@RequestMapping(value = "permissionListByUserId",method = RequestMethod.GET)
	public List<SysPermission> permissionList(@RequestParam(value = "userId") long userId) {
		return service.listByUserId(userId);
	}

	@ResponseBody
	@RequestMapping(value = "getNodes",method = RequestMethod.GET)
	public List<TreeNode> getNodeList(@RequestParam(value = "id",defaultValue = "1") long parentId) {
		List<TreeNode> list = service.getNodeList(parentId);
		return list;
	}
}
