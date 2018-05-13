package com.test.spring.proxy;

import org.springframework.aop.framework.ProxyFactory;

public class Run {
    public static void main(String[] args){
        /*
        Waiter waiter=new WaiterImp();
        BeforeAdvice beforeAdvice=new BeforeAdvice();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);
        Waiter proxy= (Waiter) proxyFactory.getProxy();
        proxy.greet();
        */
       // IHello hello= (IHello) new DynaProxyHello().bind(new Hello());
        //hello.sayHello("t");

        IHello hello = (IHello) new DynaProxyHello1().bind(new Hello(),new DLogger());//如果我们需要日志功能，则使用代理类
                //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
        hello.sayHello("明天");


    }
}
