package com.test.spring.proxy;

import java.lang.reflect.Method;
import java.util.Date;

public class DLogger implements ILogger{
    public void start(Method method) {
        System.out.println(new Date()+ method.getName() + " say hello start...");
    }

    public void end(Method method) {
        System.out.println(new Date()+ method.getName() + " say hello end");
    }
}
