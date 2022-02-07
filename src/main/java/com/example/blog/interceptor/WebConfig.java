package com.example.blog.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
//public class WebConfig extends WebMvcConfigurationSupport {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/admin/**")
//                .excludePathPatterns("/admin")//排除admin
//                .excludePathPatterns("/admin/login");//排除login
////        super.addInterceptors(registry);
//    }
//
//}
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin")//排除admin
                .excludePathPatterns("/admin/login");//排除login
//        super.addInterceptors(registry);
    }

}