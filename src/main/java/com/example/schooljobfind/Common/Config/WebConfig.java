package com.example.schooljobfind.Common.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    //WebSocket跨域配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebContentInterceptor())
                .excludePathPatterns("/chat/**");
    }
    //Web跨域配置
    @Override
    public void addCorsMappings(CorsRegistry registry){
        //设置允许跨域的路径（哪些接口）
        registry.addMapping("/**")
                //设置允许跨域请求的域名
                .allowedOrigins("*")
                //是否允许带cookie
                .allowCredentials(true)
                //允许的请求方式
                .allowedMethods("GET","POST","DELETE","PUT")
                //允许的请求头
                .allowedHeaders("*")
                //跨域允许时间
                .maxAge(3600);
    }
}
