package com.test.mysql.service;

import com.test.mysql.model.Dept_emp;
import com.test.mysql.model.Dept_manager;
import org.springframework.stereotype.Service;

@Service
public interface ModelDeptManagerService {
    Dept_manager findByPri(String emp_no);
}
