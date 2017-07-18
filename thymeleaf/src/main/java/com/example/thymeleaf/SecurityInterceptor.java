package com.example.thymeleaf;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lrj on 2017-7-17.
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进去拦截器");
        HttpSession session = request.getSession();
        if(session.getAttribute(WebSecurityConfig.SESSION_KEY)!=null){
            System.out.println("不需要跳转");
            return true;
        }
        System.out.println("需要跳转");
        //跳转到登录
        String url = "/login";
        response.sendRedirect(url);
        return false;
    }
}
