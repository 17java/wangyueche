package com.wangyueche.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件读取工具类
 * 
 * @author wujing
 */
public class ConfUtil {

	private ConfUtil() {
	}

	/**
	 * 通过静态代码块读取上传文件的验证格式配置文件,静态代码块只执行一次(单例)
	 */
	private static Properties properties = new Properties();

	// 通过类装载器装载进来
	static {
		try {
			// 从类路径下读取属性文件
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("conf.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据key读取value
	 * 
	 * @param keyName
	 *            key
	 * @return
	 */
	public static String getProperty(String keyName) {
		return getProperty(keyName, "");
	}

	/**
	 * 根据key读取value，key为空，返回默认值
	 * 
	 * @param keyName
	 *            key
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public static String getProperty(String keyName, String defaultValue) {
		return properties.getProperty(keyName, defaultValue);
	}
}
