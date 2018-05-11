package com.test.mysql.service;

import com.test.mysql.model.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelEmpService {
    List<Employees> findAll();
}
