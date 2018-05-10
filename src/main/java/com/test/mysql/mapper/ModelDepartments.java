package com.test.mysql.mapper;

import com.test.mysql.model.Departments;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface ModelDepartments {
    //@Select("")
    Departments selectByPri(String id);
}
