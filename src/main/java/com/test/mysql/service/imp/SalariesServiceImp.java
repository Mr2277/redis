package com.test.mysql.service.imp;

import com.test.mysql.bean.Salaries;
import com.test.mysql.mapper.SalariesMapper;
import com.test.mysql.service.SalariesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SalariesServiceImp implements SalariesService{
    @Resource
    private SalariesMapper salariesMapper;
    public List<Salaries> findAll() {
        return salariesMapper.selectAll();
    }
}
