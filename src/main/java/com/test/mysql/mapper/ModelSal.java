package com.test.mysql.mapper;

import com.test.mysql.model.Salaries;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelSal {
    List<Salaries> selectAll();
}
