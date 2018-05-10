package com.test.mysql.service;

import com.test.mysql.model.Departments;
import org.springframework.stereotype.Service;

@Service
public interface ModelDepartmentService {
   Departments findByPri(String id);
}
