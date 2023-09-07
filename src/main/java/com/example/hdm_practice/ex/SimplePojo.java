package com.example.hdm_practice.ex;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimplePojo implements Pojo{


    @Override
    public void foo() {
        log.info("### foo");
        bar(); //self - invocation
    }

    @Override
    public void bar() {
        log.info("### bar");
    }
}
