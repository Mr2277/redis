package com.test.mysql.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class ServiceTime {
    @Around("execution(* com.test.mysql.service..*.*(..))")
    public void costtime(ProceedingJoinPoint point) throws Throwable {
        Long start=System.currentTimeMillis();
        point.proceed();
        List list= (List) point.proceed();
        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
