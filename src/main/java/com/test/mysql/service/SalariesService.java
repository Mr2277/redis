package com.test.mysql.service;

import com.test.mysql.bean.Salaries;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalariesService {
    public List<Salaries> findAll();
}
