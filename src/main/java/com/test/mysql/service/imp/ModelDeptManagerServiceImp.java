package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelDeptManager;
import com.test.mysql.model.Dept_emp;
import com.test.mysql.model.Dept_manager;
import com.test.mysql.service.ModelDeptManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ModelDeptManagerServiceImp implements ModelDeptManagerService{
    @Resource
    private ModelDeptManager deptManager;
    public Dept_manager findByPri(String emp_no) {
        return deptManager.selectByPri(emp_no);
    }
}
