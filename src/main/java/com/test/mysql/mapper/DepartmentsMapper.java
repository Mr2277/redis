package com.test.mysql.mapper;

import com.test.mysql.bean.Departments;

public interface DepartmentsMapper {
    Departments selectByPrimaryKey(String id);
}
