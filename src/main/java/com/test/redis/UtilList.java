package com.test.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class UtilList {
    public static void main(String[] args){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        //System.out.println(jedis.rpush("queue","a"));
        //System.out.println(jedis.rpush("queue","b"));
        //System.out.println(jedis.rpush("queue","c d e"));
         /*
        String []s={"d","e"};
        jedis.rpush("queue",s);
        List<String>list=jedis.lrange("queue",0,-1);
        System.out.println(list.size());
        for(String ss:list){
            System.out.println(ss);
        }
        */
         jedis.lpush("queue","tt");
         System.out.println(jedis.lrange("queue",0,0));
    }
}
