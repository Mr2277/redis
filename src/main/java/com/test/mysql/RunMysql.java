package com.test.mysql;

import com.test.mysql.bean.Employees;
import com.test.mysql.model.Departments;
import com.test.mysql.service.DepartmentsService;
import com.test.mysql.service.DeptempService;
import com.test.mysql.service.EmployeeService;
import com.test.mysql.service.ModelDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.*;

public class RunMysql {
    public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_mybatis.xml");
       Jedis jedis=new Jedis("127.0.0.1",6379);

       /*


       EmployeeService employeeService=ioc.getBean(EmployeeService.class);
       long start=System.currentTimeMillis();
       // jedis.hgetAll("findAll").isEmpty();
       //List<Employees>list=employeeService.findAll(jedis);
       //employeeService.write(list,jedis);
       Employees employees=employeeService.findByKey("499999");
       long end=System.currentTimeMillis();
       System.out.println(end-start);
       System.out.println(employees.toString());
       //System.out.println(jedis.hgetAll("findAll").isEmpty());



       //long start=System.currentTimeMillis();

       //Set<String> set=jedis.keys("*");
       //System.out.println(end-start);
       //List<Employees>list=new ArrayList<Employees>();
       //for(int i=0;i<300000;i++){
         // Employees employees=new Employees();
          //System.out.println(set.iterator().next());
          //employees.s
      // }
       //long end=System.currentTimeMillis();
       //System.out.println(end-start);
       //System.out.println(jedis.keys("*").size());

       /*
       long start=System.currentTimeMillis();

       List<Employees>list=employeeService.findAll();
       employeeService.write(list,jedis);
       long end=System.currentTimeMillis();
       System.out.println(end-start);

         */

         /*

       long start=System.currentTimeMillis();

       HashMap<String,String>map= (HashMap<String, String>) jedis.hgetAll("findAll");
       List<Employees>list=new ArrayList<Employees>();
     long   end=System.currentTimeMillis();
       System.out.println(end-start);
       String str[];
       for(String key:map.keySet()){
          Employees employees=new Employees();
          employees.setEmp_no(key);
          str=map.get(key).split(",");
          employees.setBirth_date(str[1]);
          employees.setFirst_name(str[2]);
          employees.setLast_name(str[3]);
          employees.setGender(str[4]);
          employees.setHire_date(str[5]);
          list.add(employees);

       }
       //System.out.println(map.size());
       end=System.currentTimeMillis();
       System.out.println(end-start);
       System.out.println(list.size());

            */


       ModelDepartmentService modelDepartmentService=ioc.getBean(ModelDepartmentService.class);
       Departments departments=modelDepartmentService.findByPri("d008");
       System.out.println(departments.getDept_no());
    }
}
