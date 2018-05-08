package com.test.mysql.service.imp;

import com.test.mysql.mapper.DeptempMapper;
import com.test.mysql.service.DeptempService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class DeptempServicemp implements DeptempService{
    @Resource
    private DeptempMapper deptempMapper;
    public int innerjoinmanager() {
         int count=deptempMapper.innerjoincount();
         return count;
    }
}
