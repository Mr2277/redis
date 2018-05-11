package com.test.mysql.service;

import com.test.mysql.bean.Titles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TitlesService {
    List<Titles>findAll();
}
