package com.test.mysql.mapper;

import com.test.mysql.model.Dept_emp;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface ModelDempEmp {
    Dept_emp selectByPri(String demp_no);
    List<Dept_emp> findAll();
    List<Map<String,Integer>>selectCount();
}
