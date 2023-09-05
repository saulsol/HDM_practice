package com.example.hdm_practice.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class InterceptorEx implements HandlerInterceptor {
    // 상위 클래스 default 메소드로 선언되어 있어서 바로 구현을 하지 않아도 된다.

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("인터셉터 동작");

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        System.out.println("실행되고 있는 컨트롤러 객체 : " + handlerMethod.getBean() );
        System.out.println("Method:" + method);

        return true;
    }
}
