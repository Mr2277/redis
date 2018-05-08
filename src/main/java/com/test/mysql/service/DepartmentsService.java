package com.test.mysql.service;

import com.test.mysql.bean.Departments;

import java.util.List;

public interface DepartmentsService {
    void add(Departments departments);
    int update(Departments departments);
    int delete(Departments departments);
    Departments findById(int id);
    List<Departments> findAll();

}
