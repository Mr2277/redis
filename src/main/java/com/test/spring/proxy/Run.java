package com.test.spring.proxy;

import org.springframework.aop.framework.ProxyFactory;

public class Run {
    public static void main(String[] args){
        Waiter waiter=new WaiterImp();
        BeforeAdvice beforeAdvice=new BeforeAdvice();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);
        Waiter proxy= (Waiter) proxyFactory.getProxy();
        proxy.greet();
    }
}
