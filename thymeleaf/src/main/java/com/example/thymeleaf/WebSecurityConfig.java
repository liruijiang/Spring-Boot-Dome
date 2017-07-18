package com.example.thymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lrj on 2017-7-17.
 */
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter{
    /**
     * 登录session key
     */
    public final static String SESSION_KEY = "user";



    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("添加拦截器");
        registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/login","/login*");;
        super.addInterceptors(registry);
    }

}
