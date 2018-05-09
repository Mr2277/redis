package com.test.mysql.service;

import com.test.mysql.bean.Employees;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employees>findAll();
    void write(List<Employees>list, Jedis jedis);
}
