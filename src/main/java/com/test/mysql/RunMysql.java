package com.test.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.transform.Templates;
import java.util.List;

public class RunMysql {
   public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
       JdbcTemplate templates=ioc.getBean(JdbcTemplate.class);
       System.out.println(templates.toString());
       //templates.execute("");
       //templates.execute("show tables");
       List list=templates.queryForList("select * from departments");
       System.out.println(list.size());
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }
   }
}
