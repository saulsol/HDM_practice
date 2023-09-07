package com.example.hdm_practice.ex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimplePojoTest {

    @Test
    @DisplayName("pojo를 만들어서 직접 호출한다.")
    void direct_pojo(){
        final Pojo pojo = new SimplePojo();
        pojo.foo(); // direct method call on the 'pojo' reference
    }

    @Test
    @DisplayName("proxy를 이용해서 호출한다")
    void proxy_self_invocation(){
        final ProxyFactory proxyFactory = new ProxyFactory(new SimplePojo());

        proxyFactory.addInterface(Pojo.class);
        proxyFactory.addAdvice(new ExecuteLoggingAdvice());

        final Pojo pojo = (Pojo) proxyFactory.getProxy();

        pojo.foo();
    }

}