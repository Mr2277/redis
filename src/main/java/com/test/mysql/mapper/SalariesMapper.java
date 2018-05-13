package com.test.mysql.mapper;

import com.test.mysql.bean.Salaries;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalariesMapper {
    public List<Salaries>selectAll();
}
