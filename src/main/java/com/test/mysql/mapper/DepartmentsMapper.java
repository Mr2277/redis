package com.test.mysql.mapper;

import com.test.mysql.bean.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Component
public interface DepartmentsMapper {
    Departments selectByPrimaryKey(String id);
}
