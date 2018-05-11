package com.test.mysql.mapper;

import com.test.mysql.bean.Titles;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitlesMapper {
    List<Titles>selectAll();
}
