package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelDempEmp;
import com.test.mysql.model.Dept_emp;
import com.test.mysql.service.ModelDempEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ModelDempEmpServiceImp implements ModelDempEmpService {
    @Resource
   private ModelDempEmp modelDempEmp;
    public Dept_emp findByPri(String emp_no) {
        return modelDempEmp.selectByPri(emp_no);
    }

    public List<Dept_emp> findAll() {
        return modelDempEmp.findAll();
    }

    public List<Map<String,Integer>> count() {
        return modelDempEmp.selectCount();
    }


}
