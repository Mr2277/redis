package com.test.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.transform.Templates;

public class RunMysql {
   public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
       JdbcTemplate templates=ioc.getBean(JdbcTemplate.class);
       templates.execute("");
   }
}
