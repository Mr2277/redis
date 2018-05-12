package com.test.spring.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice{
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName());
        for(int i=0;i<objects.length;i++){
            System.out.print(objects[i].toString()+" ");
        }
        System.out.println(o.toString());
    }
}
