package com.test.mysql.mapper;

import com.test.mysql.model.Dept_emp;
import com.test.mysql.model.Dept_manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelDeptManager {
    Dept_manager selectByPri(String emp_no);
}
