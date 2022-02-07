package com.example.blog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//拦截器，让后台界面需登录才能看
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("user")==null){//判断session里面有没有user，如果为空,重定向到登录页面
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
