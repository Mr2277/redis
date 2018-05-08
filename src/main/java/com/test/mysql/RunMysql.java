package com.test.mysql;

import com.test.mysql.bean.Departments;
import com.test.mysql.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class RunMysql {
    public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_mybatis.xml");
       DepartmentsService service=ioc.getBean(DepartmentsService.class);
       Departments departments=service.findById("d009");
   }
}
