package com.test.mysql.mapper;

import com.test.mysql.model.Titles;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelTi {
    List<Titles>selectAll();
}
