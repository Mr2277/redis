package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_mybatis.xml");
        CustomerBo customerBo=applicationContext.getBean(CustomerBo.class);
        customerBo.addCustomer();
    }
}
