package com.wangyueche.controller.admin;

import com.wangyueche.util.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录功能
 * 
 * @author wujing
 */
@Controller
@RequestMapping(value = "/admin")
public class IndexController extends BaseController {

	/**
	 * 进入首页
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void getIndex() {
	}

	/**
	 * 进入首页
	 */
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String postIndex() {
		return redirect("/admin/index");
	}

}
