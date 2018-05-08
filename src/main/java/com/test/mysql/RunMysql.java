package com.test.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.xml.transform.Templates;
import java.util.List;

public class RunMysql {
   public static void main(String[] args){
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_mybatis.xml");

   }
}
