package com.wangyueche.util;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Restful 调用工具类
 * 
 * @author wujing
 */
public class RestTemplateUtil {
	private static final Logger logger = LoggerFactory.getLogger(RestTemplateUtil.class);

	private static SimpleClientHttpRequestFactory requestFactory = null;
	static {
		requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(60000); // 连接超时时间，单位=毫秒
		requestFactory.setReadTimeout(60000); // 读取超时时间，单位=毫秒
	}
	private static RestTemplate restTemplate = new RestTemplate(requestFactory);

	public static JsonNode postForObject(String url, Map<String, Object> map) {
		logger.info("POST 请求， url={}，map={}", url, map.toString());
		return restTemplate.postForObject(url, map, JsonNode.class);
	}

}
