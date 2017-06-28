package com.wangyueche.util.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wangyueche.util.ConfUtil;
import com.wangyueche.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.TimeUnit;

import static com.wangyueche.controller.LoginController.REDIS_KEY;


/**
 * Session拦截器
 * 
 * @author wujing
 */
public class SessionInterceptor implements HandlerInterceptor {
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		ValueOperations<String, String> value = redisTemplate.opsForValue();
		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie c : cookies) {
				if (null != value.get(REDIS_KEY + c.getValue())) {
					redisTemplate.expire(REDIS_KEY + c.getValue(), 3600, TimeUnit.SECONDS);
					return true;
				}
			}
		}
		response.setStatus(403);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

}
