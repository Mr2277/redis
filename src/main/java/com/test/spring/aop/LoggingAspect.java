package com.test.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.test.spring.aop.CustomerBo.addCustomer(..))")
    public void logBefore() {

        System.out.println("logBefore() is running!");
        //System.out.println("hijacked : " + joinYiibai.getSignature().getName());
        System.out.println("******");
    }
}
