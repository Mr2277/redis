package com.test.mysql.service.imp;

import com.test.mysql.mapper.ModelSal;
import com.test.mysql.model.Salaries;
import com.test.mysql.service.ModelSalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ModelSalServiceImp implements ModelSalService{
    @Resource
    private ModelSal modelSal;
    public List<Salaries> findAll() {
        return modelSal.selectAll();
    }
}
