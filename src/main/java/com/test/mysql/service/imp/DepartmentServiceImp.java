package com.test.mysql.service.imp;

import com.test.mysql.bean.Departments;
import com.test.mysql.mapper.DepartmentsMapper;
import com.test.mysql.service.DepartmentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepartmentServiceImp implements DepartmentsService{
    @Resource
    private DepartmentsMapper departmentsMapper;
    public void add(Departments departments) {

    }

    public int update(Departments departments) {
        return 0;
    }

    public int delete(Departments departments) {
        return 0;
    }

    public Departments findById(String id) {
        System.out.println("d");
        Departments departments=departmentsMapper.selectByPrimaryKey(id);
        return departments;
    }

    public List<Departments> findAll() {
        return null;
    }
}
