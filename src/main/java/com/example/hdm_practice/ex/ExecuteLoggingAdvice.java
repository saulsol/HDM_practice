package com.example.hdm_practice.ex;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class ExecuteLoggingAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info(">>> execute method [{}]", invocation.getMethod().getName());
        return invocation.proceed();
    }
}
