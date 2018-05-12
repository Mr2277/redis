package com.test.spring.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.test.spring.aop.CustomerBo.addCustomer(..))")
    public void logBefore() {

        System.out.println("logBefore() is running!");
        //System.out.println("hijacked : " + joinYiibai.getSignature().getName());
        System.out.println("******");
    }
    @Around("execution(* com.test.spring.aop.CustomerBo.addCustomer(..))")
    public void logAround() throws Throwable {

        System.out.println("logAround() is running!");
        //System.out.println("hijacked method : " + joinYiibai.getSignature().getName());
        //System.out.println("hijacked arguments : " + Arrays.toString(joinYiibai.getArgs()));

        System.out.println("Around before is running!");
        //joinYiibai.proceed(); //continue on the intercepted method
        System.out.println("Around after is running!");

        System.out.println("******");

    }
}
