package com.test.mysql.service.imp;

import com.test.mysql.bean.Employees;
import com.test.mysql.mapper.EmployeeMapper;
import com.test.mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employees> findAll(Jedis jedis) {
        List<Employees> list;
        if(jedis.hgetAll("findAll").isEmpty()) {
            list = employeeMapper.selectAll();
            return list;

        }
            else {
            list=read(jedis,"findAll");
            return list;

        }

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

    public List<Employees> read(Jedis jedis,String name) {
        HashMap<String,String>map= (HashMap<String, String>) jedis.hgetAll("findAll");
        List<Employees> list=new ArrayList<Employees>();
        String str[];
            for(String key:map.keySet()){
                Employees employees=new Employees();
                employees.setEmp_no(key);
                str=map.get(key).split(",");
                employees.setBirth_date(str[1]);
                employees.setFirst_name(str[2]);
                employees.setLast_name(str[3]);
                employees.setGender(str[4]);
                employees.setHire_date(str[5]);
                list.add(employees);

            }
            return (List<Employees>) list;
        }

    public Employees findByKey(String id) {
       return employeeMapper.selectByPrimary(id);
    }


}

