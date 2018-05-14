package com.test.spring.reflect.two;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?>c=B.class;
        Method[] method=c.getMethods();
        for(int i=0;i<method.length;i++){
            System.out.println(method[i].getName());
        }
        //Method setA=c.getMethod("setA");
        //setA.invoke(c.newInstance(),"dd");
        Method method1=c.getMethod("setA", String.class);
       // method1.invoke(c.newInstance(),"ttt");
        Field[] fields=c.getFields();
        Field[] fields1=c.getDeclaredFields();
        for(int j=0;j<fields.length;j++){
            System.out.println(fields[j].getName());
        }
        System.out.println(fields[0].get(c.newInstance() ));
    }
}
