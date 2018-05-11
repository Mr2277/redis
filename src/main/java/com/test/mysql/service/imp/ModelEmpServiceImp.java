package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelEmpMap;
import com.test.mysql.model.Dept_emp;
import com.test.mysql.model.Employees;
import com.test.mysql.service.ModelDempEmpService;
import com.test.mysql.service.ModelEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class ModelEmpServiceImp implements ModelEmpService{
    @Resource
    private ModelEmpMap modelEmpMap;
    public List<Employees> findAll() {
        return modelEmpMap.selectAll();
    }
}
