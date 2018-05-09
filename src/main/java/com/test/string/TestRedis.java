package com.test.string;

import com.test.mysql.bean.Departments;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestRedis {
    public static void main(String[] args){
        /*
        Departments departments=new Departments();
        departments.setDept_no("d456");
        departments.setDept_name("信息");
        Jedis jedis=new Jedis("127.0.0.1",6379);
        //jedis.set(departments.getDept_no(), String.valueOf(departments));
        //System.out.println(departments.toString());
        System.out.println(jedis.get(departments.getDept_no()));
        */
        //连接redis Jedis redis = new Jedis("127.0.0.1", 6380, 400000); redis.auth("123456"); Map<String, String> data = new HashMap<String, String>(); redis.select(0); redis.flushDB(); //hmset long start = System.currentTimeMillis(); //直接hmset for (int i = 0; i < 10000; i++) { data.clear(); data.put("k_" + i, "v_" + i); redis.hmset("key_" + i, data); } long end = System.currentTimeMillis(); System.out.println("dbsize:[" + redis.dbSize() + "] .. "); System.out.println("hmset without pipeline used [" + (end - start) / 1000 + "] seconds .."); redis.select(0); redis.flushDB(); //使用pipeline hmset Pipeline p = redis.pipelined(); start = System.currentTimeMillis(); for (int i = 0; i < 10000; i++) { data.clear(); data.put("k_" + i, "v_" + i); p.hmset("key_" + i, data); } p.sync(); end = System.currentTimeMillis(); System.out.println("dbsize:[" + redis.dbSize() + "] .. "); System.out.println("hmset with pipeline used [" + (end - start) / 1000 + "] seconds .."); //hmget Set keys = redis.keys("*"); //直接使用Jedis hgetall start = System.currentTimeMillis(); Map<String, Map<String, String>> result = new HashMap<String, Map<String, String>>(); for (Object key : keys) { result.put((String) key, redis.hgetAll((String) key)); } end = System.currentTimeMillis(); System.out.println("result size:[" + result.size() + "] .."); System.out.println("hgetAll without pipeline used [" + (end - start) / 1000 + "] seconds .."); //使用pipeline hgetall Map<String, Response<Map<String, String>>> responses = new HashMap<String, Response<Map<String, String>>>(keys.size()); result.clear(); start = System.currentTimeMillis(); for (Object key : keys) { responses.put((String) key, p.hgetAll((String) key)); } p.sync(); for (String k : responses.keySet()) { result.put(k, responses.get(k).get()); } end = System.currentTimeMillis(); System.out.println("result size:[" + result.size() + "] .."); System.out.println("hgetAll with pipeline used [" + (end - start) / 1000 + "] seconds .."); redis.disconnect();


        Jedis redis = new Jedis("127.0.0.1", 6379, 400000);
        Map<String, String> data = new HashMap<String, String>();

        //redis.auth("123456");
        /*
         Map<String, String> data = new HashMap<String, String>();
         redis.select(0);
         redis.flushDB();
         long start = System.currentTimeMillis();
         //直接hmset
         for (int i = 0; i < 1000000; i++) {
             data.clear();
             data.put("k_" + i, "v_" + i);
             redis.hmset("key_" + i, data);
         }
             long end = System.currentTimeMillis();
         System.out.println(end-start);
               */
             //System.out.println("hmset without pipeline used [" + (end - start) / 1000 + "] seconds ..");
             redis.select(0);
             redis.flushDB();
             //使用pipeline hmset
        /*
             Pipeline p = redis.pipelined();
             long start = System.currentTimeMillis();
             for (int i = 0; i < 1000000; i++) {
                 data.clear();
                 data.put("k_" + i, "v_" + i);
                 p.hmset("key_" + i, data);
             }
             p.sync();
             long end = System.currentTimeMillis();
             System.out.println(end-start);
             /*
             //hmget
             Set keys = redis.keys("*");
             //直接使用Jedis hgetall
             start = System.currentTimeMillis();
             Map<String, Map<String, String>> result = new HashMap<String, Map<String, String>>();
             for (Object key : keys) {
                 result.put((String) key, redis.hgetAll((String) key));
             }
             end = System.currentTimeMillis();
             System.out.println("result size:[" + result.size() + "] ..");
             System.out.println("hgetAll without pipeline used [" + (end - start) / 1000 + "] seconds ..");
             //使用pipeline hgetall
            Map<String, Response<Map<String, String>>> responses = new HashMap<String, Response<Map<String, String>>>(keys.size());
            result.clear(); start = System.currentTimeMillis();
            for (Object key : keys) {
                responses.put((String) key, p.hgetAll((String) key));
            }
            p.sync();
            for (String k : responses.keySet()) {
                result.put(k, responses.get(k).get());
            }
            end = System.currentTimeMillis();
            System.out.println("result size:[" + result.size() + "] ..");
            System.out.println("hgetAll with pipeline used [" + (end - start) / 1000 + "] seconds ..");
              */
           // redis.disconnect();



    }
}
