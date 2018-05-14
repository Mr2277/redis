package com.test.spring.reflect.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Run {
    public static void main(String[] args){
        //A a= (A) Proxy.newProxyInstance(A.class.getClassLoader(),new Class[]{A.class},new ADynaProxy());
        //a.start();
        //A a= (A) new ADynaProxy().bind(new AImp());
        //a.start();
        //ProxyInterface proxy = (ProxyInterface)Proxy.newProxyInstance(ProxyInterface.class.getClassLoader(),new Class[]{ProxyInterface.class}, new ProxyObject(real));
        A a= (A) Proxy.newProxyInstance(A.class.getClassLoader(),new Class[]{A.class},new ADynaProxy());
        a.start();
    }
}
