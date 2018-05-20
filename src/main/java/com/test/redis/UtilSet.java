package com.test.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class UtilSet {
    public static void main(String[] args){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.sadd("myset","hello");
        jedis.sadd("myset","foo");
        Set<String> set=jedis.smembers("myset");
        System.out.println(set.size());
    }
}
