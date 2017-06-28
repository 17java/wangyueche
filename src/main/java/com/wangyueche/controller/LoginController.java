package com.wangyueche.controller;

import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.service.UserService;
import com.wangyueche.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping
public class LoginController extends BaseController {
    public static final String COOKIE_KEY = "netcar";
    public static final String REDIS_KEY = "token_";

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserService service;

    /**
     * 登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String postLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) {
        SysUser user = service.login(username, password);
        //判断用户是否存在
        if (null != user) {
            ValueOperations<String, String> value = redisTemplate.opsForValue();
            Cookie[] cookies = request.getCookies();
            Cookie cookie = null;

            if (null != cookies) {
                for (Cookie c : cookies) {
                    //判断是否存在cookie
                    if (COOKIE_KEY.equals(c.getName())) {
                        //存在重新设置cookie值
                        c.setValue(username);
                        cookie = c;
                        break;
                    }
                }
            }

            if (null == cookie) {
                cookie = new Cookie(COOKIE_KEY, username);
            }

            String userKey = REDIS_KEY + username;
            response.addCookie(cookie);
            //将登录信息保存到redis中
            value.set(userKey, user.getName());
            redisTemplate.expire(userKey, 3600, TimeUnit.SECONDS);
            if (null != value.get(userKey)) {
                return "success";
            }
        }
        return "error";
    }

    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie c : cookies) {
                if (COOKIE_KEY.equals(c.getName())) {
                    //redis中删除对应数据
                    redisTemplate.delete(REDIS_KEY + c.getValue());
                    //立即删除cookie
                    c.setMaxAge(0);
                    response.addCookie(c);
                    break;
                }
            }
        }
        return "success";
    }

}
