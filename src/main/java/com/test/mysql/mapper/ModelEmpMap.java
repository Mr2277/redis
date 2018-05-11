package com.test.mysql.mapper;

import com.test.mysql.model.Employees;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelEmpMap {
    List<Employees>selectAll();
}
