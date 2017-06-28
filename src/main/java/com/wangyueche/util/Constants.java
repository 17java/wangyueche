package com.wangyueche.util;

/**
 * 常量工具类
 * 
 * @author wujing
 */
public final class Constants {

	private Constants() {
	}

	/**
	 * 常量
	 * 
	 * @author wujing
	 */
	public interface Token {
		public final static String RONCOO = "roncoo";
	}

	/**
	 * 状态类型
	 * 
	 * @author wujing
	 */
	public interface Status {
		public final static String ZERO = "0";
		public final static String ONE = "1";
		public final static String TWO = "2";
		public final static String THREE = "3";
	}

	/**
	 * 数字类型
	 * 
	 * @author wujing
	 * @version 1.0
	 */
	public interface Num {
		public final static int ZERO = 0;
		public final static int ONE = 1;
		public final static int FIVE = 5;
		public final static int TEN = 10;
	}

}
