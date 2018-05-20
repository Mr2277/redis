package com.test.md5;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Util {
    public static void main(String[] args){
        /*
        HashMap<String,String>hashMap=new HashMap<String, String>();
        Long start=System.currentTimeMillis();
        for(int i = 0; i<10000000; i++){
            String s=Integer.toString(i);
            hashMap.put(s,s);
        }
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
        /*
        HashMap<String,String>hashMap1=new HashMap<String, String>();
        Long start1=System.currentTimeMillis();
        for(int i = 0; i<10000000; i++){
            String s=Integer.toString(i);
            hashMap1.put(s,s);
        }
        Long end1=System.currentTimeMillis();
        System.out.println(end1-start1);
        */
        ConcurrentHashMap<String,String>concurrentHashMap=new ConcurrentHashMap<String, String>();
        Long start=System.currentTimeMillis();
        for(int i = 0; i<10000000; i++){
            String s=Integer.toString(i);
            concurrentHashMap.put(s,s);
        }
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
