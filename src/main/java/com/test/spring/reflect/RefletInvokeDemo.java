package com.test.spring.reflect;

import java.lang.reflect.Method;

public class RefletInvokeDemo {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("com.test.spring.reflect.Student4");
        // 实例化对象
        /*
        Object obj = cls.newInstance();
        //获取setName()方法
        Method setNameMethod = cls.getMethod("setName", String.class);
        //获取getName()方法
        Method getNameMethod = cls.getMethod("getName");
        //调用setName()方法，相当于 对象.setName("马小超");
        setNameMethod.invoke(obj, "马小超");
        //调用getName()方法并输出
        System.out.println(getNameMethod.invoke(obj));
        */
        System.out.println(cls.newInstance().toString());
        Student4 student4=new Student4();
        Method[] method=student4.getClass().getMethods();
        for(int i=0;i<method.length;i++){
            System.out.println(method[i].getName());
        }

    }
}
