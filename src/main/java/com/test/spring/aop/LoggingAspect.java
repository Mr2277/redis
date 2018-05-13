package com.test.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
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
    @Around("execution(* com.test.spring.aop.CustomerBo.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around before is running!");
        pjp.proceed(); //continue on the intercepted method
        System.out.println(pjp.getTarget().toString());
        System.out.println("Around after is running!");

        System.out.println("******");

    }
}
