package com.test.mysql.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceTime {
    @Around("execution(* com.test.mysql.service..*.*(..))")
    public void costtime(ProceedingJoinPoint point) throws Throwable {
        Long start=System.currentTimeMillis();
        point.proceed();
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
