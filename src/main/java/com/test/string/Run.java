package com.test.string;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class Run {
    public static void main(String[] args){
       Jedis jedis=new Jedis("127.0.0.1",6379);
       //Set<String>set=jedis.keys("*");
       /*
       Iterator<String> iterable=set.iterator();
       while(iterable.hasNext()){
           System.out.println(iterable.next().replace().toString());
       }
       */

       jedis.flushDB();
        Set<String>set=jedis.keys("*");
        System.out.println(set.size());
    }
}
