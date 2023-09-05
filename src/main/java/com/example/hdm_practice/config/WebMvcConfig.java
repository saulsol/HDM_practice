package com.example.hdm_practice.config;

import com.example.hdm_practice.interceptor.InterceptorEx;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new InterceptorEx()).addPathPatterns("/serverTest");
    }
}
