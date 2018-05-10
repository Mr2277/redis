package com.test.mysql.service;

import com.test.mysql.model.Salaries;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelSalService {
    List<Salaries> findAll();
}
