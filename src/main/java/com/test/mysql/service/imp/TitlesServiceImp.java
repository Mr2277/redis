package com.test.mysql.service.imp;

import com.test.mysql.bean.Titles;
import com.test.mysql.mapper.TitlesMapper;
import com.test.mysql.service.TitlesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TitlesServiceImp implements TitlesService{
    @Resource
    private TitlesMapper titlesMapper;
    public List<Titles> findAll() {
        return titlesMapper.selectAll();
    }
}
