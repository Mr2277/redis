package com.test.mysql.mapper;

import com.test.mysql.bean.Employees;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface EmployeeMapper {
    List<Employees>selectAll();
    Employees selectByPrimary(String id);
}
