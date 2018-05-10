package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelDepartments;
import com.test.mysql.model.Departments;
import com.test.mysql.service.ModelDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ModelDepartmentServiceImp implements ModelDepartmentService{
    @Resource
    private ModelDepartments modelDepartments;
    public Departments findByPri(String id) {
        Departments departments=modelDepartments.selectByPri(id);
        return departments;
    }
}
