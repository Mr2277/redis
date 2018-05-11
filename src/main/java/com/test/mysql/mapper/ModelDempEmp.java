package com.test.mysql.mapper;

import com.test.mysql.model.Dept_emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelDempEmp {
    Dept_emp selectByPri(String demp_no);
    List<Dept_emp> findAll();
}
