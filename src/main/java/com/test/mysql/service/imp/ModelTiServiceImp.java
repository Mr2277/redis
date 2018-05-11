package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelTi;
import com.test.mysql.model.Titles;
import com.test.mysql.service.ModelTiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModelTiServiceImp implements ModelTiService{
    @Resource
    private ModelTi modelTi;
    public List<Titles> findAll() {
        return modelTi.selectAll();
    }
}
