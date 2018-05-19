package com.test.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class UtilString {
    public static void main(String[] args){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        Set<String>set=jedis.keys("*");
        System.out.println(set.iterator().next());
        /**
         * set get
         */
        jedis.set("name","zhangsan");
        System.out.println(jedis.get("name"));

        /**
         * update key
         */
        jedis.set("name","bikang");
        System.out.println(jedis.get("name"));

        /**
         * setex
         */
        System.out.println(jedis.setex("name",3,"zhangsan"));
    }
}
