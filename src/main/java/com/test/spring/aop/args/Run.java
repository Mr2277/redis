package com.test.spring.aop.args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Callable;

public class Run {
    public static void main(String[] args){
        //A aa=new AImp();
        //aa.a("ttt");
        ApplicationContext context=new ClassPathXmlApplicationContext("spring_mybatis.xml");
        A aa=context.getBean(A.class);
        B bb= (B) context.getBean("B");
        C cc= (C) context.getBean("C");
        aa.a(cc);
    }
}
