package com.test.mysql;

import com.test.mysql.bean.Salaries;
import com.test.mysql.bean.Titles;
import com.test.mysql.mapper.ModelDeptManager;
import com.test.mysql.model.*;
import com.test.mysql.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunMysql {
    public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_mybatis.xml");
       //Jedis jedis=new Jedis("127.0.0.1",6379);

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


       //ModelDepartmentService modelDepartmentService=ioc.getBean(ModelDepartmentService.class);
       //Departments departments=modelDepartmentService.findByPri("d008");
       //System.out.println(departments.getDept_no());
       //ModelDempEmpService modelDempEmp=ioc.getBean(ModelDempEmpService.class);
       //Dept_emp dept_emp=modelDempEmp.findByPri("49999");
       //System.out.println(dept_emp.getEmployees().getEmp_no());

       //ModelDeptManagerService modelDeptManagerService=ioc.getBean(ModelDeptManagerService.class);

       /*
       ModelDempEmpService modelDempEmpService=ioc.getBean(ModelDempEmpService.class);
       Long start =System.currentTimeMillis();
       //Dept_manager deptManager=modelDeptManagerService.findByPri("110022");
       Dept_emp dept_emp=modelDempEmpService.findByPri("110022");
       Long end=System.currentTimeMillis();
       System.out.println(end-start);
       */

          /*

       ModelSalService modelSalService=ioc.getBean(ModelSalService.class);
       List<Salaries>list=modelSalService.findAll();
       System.out.println(list.size());

           */
           /*
          ModelDempEmpService modelDempEmpService=ioc.getBean(ModelDempEmpService.class);
          Long start=System.currentTimeMillis();
          List<Dept_emp> list=modelDempEmpService.findAll();

         // List<Map<String,Integer>>list= modelDempEmpService.count();

          Long end=System.currentTimeMillis();
          System.out.println(end-start);
        /*
          System.out.println(list.size());
          for(Map<String,Integer> m:list){
              System.out.println(m.keySet());
              System.out.println(m.values());
          }

           */
            /*
           ModelSalService modelSalService=ioc.getBean(ModelSalService.class);
           Long start=System.currentTimeMillis();
           List<Salaries>list=modelSalService.findAll();
           Long end=System.currentTimeMillis();
           System.out.println(end-start);
           */

              /*
            ModelTiService modelTiService=ioc.getBean(ModelTiService.class);
            List<Titles>list=modelTiService.findAll();
            System.out.println(list.size());

            */

              /*
            ModelEmpService modelEmpService=ioc.getBean(ModelEmpService.class);
            List<Employees>list=modelEmpService.findAll();
            System.out.println(list.size());
            */

              //TitlesService titlesService=ioc.getBean(TitlesService.class);
              //List<Titles>list=titlesService.findAll();
             // System.out.println(list.size());


               SalariesService salariesService=ioc.getBean(SalariesService.class);
               salariesService.findAll();
               //System.out.println(list.size());

    }


}
