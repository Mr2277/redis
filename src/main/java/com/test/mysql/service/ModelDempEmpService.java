package com.test.mysql.service;

import com.test.mysql.model.Dept_emp;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface ModelDempEmpService {
    Dept_emp findByPri(String emp_no);
    List<Dept_emp> findAll();
    List<Map<String,Integer>> count();
}
