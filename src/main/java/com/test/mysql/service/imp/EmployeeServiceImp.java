package com.test.mysql.service.imp;

import com.test.mysql.bean.Employees;
import com.test.mysql.mapper.EmployeeMapper;
import com.test.mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employees> findAll() {
        List<Employees>list=employeeMapper.selectAll();
        return list;
    }
}
