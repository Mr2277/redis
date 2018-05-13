package com.test.spring.proxy;

public class Hello implements IHello{
    public void sayHello(String str) {
        System.out.println("Hello"+str);
    }
}
