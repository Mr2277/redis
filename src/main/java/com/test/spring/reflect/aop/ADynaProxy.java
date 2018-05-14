package com.test.spring.reflect.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ADynaProxy implements InvocationHandler{
    //private Object target;
    /*
    public Object bind(Object o){
        //this.target=o;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }
    */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*
        Method [] methods=proxy.getClass().getMethods();
        for(Method s:methods){
            System.out.println(s.getName());

        }
        */
        //System.out.println(method.getName());
        //Class<A> a=A.class;
        //a.newInstance();
        //Object o=new Object();
        Class<?> c=BImp.class;
        BImp bImp= (BImp) c.newInstance();
        Method method1=c.getMethod(method.getName());
        method1.invoke(bImp,args);
        Class<?>tClass=AImp.class;
        method.invoke(tClass.newInstance(),args);
        //method.invoke(target,args);
        return null;
    }

}
