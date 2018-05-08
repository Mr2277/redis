package com.test.mysql;

import com.test.mysql.bean.Departments;
import com.test.mysql.bean.Employees;
import com.test.mysql.service.DepartmentsService;
import com.test.mysql.service.DeptempService;
import com.test.mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

public class RunMysql {
    public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_mybatis.xml");
       //DepartmentsService service=ioc.getBean(DepartmentsService.class);
       //Departments departments=service.findById("d009");
       //System.out.println(ioc.getBean(DeptempService.class).innerjoinmanager());
       EmployeeService employeeService=ioc.getBean(EmployeeService.class);

       List<Employees> list=employeeService.findAll();
       System.out.println(list.size());

   }
}
