package com.desing.creational.singletion;

import org.springframework.util.StringUtils;

import java.util.IdentityHashMap;
import java.util.Map;

public class ContainerSingletion {

    private ContainerSingletion(){

    }
    private static Map<String,Object> map=new IdentityHashMap<String,Object>();
    public static void pubSingletion(String key,Object instance){
        if (!StringUtils.isEmpty(key) && instance!=null)
        {
            if (!map.containsKey(key)){
                map.put(key, instance);
            }
        }
    }
    public static Object getInstance(String key){
        return map.get(key);
    }
}
