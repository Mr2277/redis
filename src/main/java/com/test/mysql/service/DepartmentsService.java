package com.test.mysql.service;

import com.test.mysql.bean.Departments;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface DepartmentsService {
    void add(Departments departments);
    int update(Departments departments);
    int delete(Departments departments);
    Departments findById(String id);
    List<Departments> findAll();

}
