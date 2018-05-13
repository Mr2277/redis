package com.test.spring.aop.args;

import org.springframework.stereotype.Component;

@Component
public class AImp implements A {
    public void a(C s) {
        System.out.println(s);
    }
}
