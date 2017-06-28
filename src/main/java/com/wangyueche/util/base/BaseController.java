package com.wangyueche.util.base;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基础类，所有controller都应该继承这个类
 * 
 * @author wujing
 */
public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String TEXT_UTF8 = "text/html;charset=UTF-8";
	public static final String JSON_UTF8 = "application/json;charset=UTF-8";
	public static final String XML_UTF8 = "application/xml;charset=UTF-8";

	public static final String LIST = "list";
	public static final String VIEW = "view";
	public static final String ADD = "add";
	public static final String SAVE = "save";
	public static final String EDIT = "edit";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";
	public static final String PAGE = "page";
	public static final String PARENT = "queryForParentId";

	public static String redirect(String format, Object... arguments) {
		return new StringBuffer("redirect:").append(MessageFormat.format(format, arguments)).toString();
	}

	public static void main(String[] args) {
		System.out.println(redirect("/admin/emailAccountInfo/list"));
	}

}
