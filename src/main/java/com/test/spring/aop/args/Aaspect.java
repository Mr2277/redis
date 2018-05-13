package com.test.spring.aop.args;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aaspect {
    @Before("args(com.test.spring.aop.args.B)")
        public void before(){
           System.out.println("before");
        }
}
