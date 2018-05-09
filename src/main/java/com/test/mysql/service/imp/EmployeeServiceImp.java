package com.test.mysql.service.imp;

import com.test.mysql.bean.Employees;
import com.test.mysql.mapper.EmployeeMapper;
import com.test.mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employees> findAll() {
        List<Employees>list=employeeMapper.selectAll();
        return list;
    }

    public void write(List<Employees> list, Jedis jedis) {

        Map<String, String> data = new HashMap<String, String>();

        Pipeline p = jedis.pipelined();

        for(int i=0;i<list.size();i++){
            //data.clear();
            Employees employees=list.get(i);
            data.put(employees.getEmp_no(),employees.toString());
            //jedis.(employees.getEmp_no(),employees.toString());
        }
        jedis.hmset("findAll",data);
        p.sync();
         /*
        for(int i=0;i<list.size();i++){
            Employees employees=list.get(i);
            jedis.set(employees.getEmp_no(),employees.toString());
        }
        */
    }
}
