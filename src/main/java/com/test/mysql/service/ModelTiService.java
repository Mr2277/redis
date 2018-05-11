package com.test.mysql.service;

import com.test.mysql.model.Titles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelTiService {
    List<Titles>findAll();
}
