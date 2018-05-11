package com.test.mysql.service;

import com.test.mysql.model.Dept_emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelDempEmpService {
    Dept_emp findByPri(String emp_no);
    List<Dept_emp> findAll();
}
