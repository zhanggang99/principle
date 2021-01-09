package com.desing.creational.singletion;

import java.io.Serializable;

public class HungrySingletion implements Serializable {
    private final static HungrySingletion hungrySingletion=new HungrySingletion();
    private HungrySingletion(){
        //预防反射调用
        if(hungrySingletion!=null)
            throw new RuntimeException("单独构造器禁止调用");
    }
    public static HungrySingletion getInstance(){return hungrySingletion;}
    private Object readResolve(){
        return hungrySingletion;
    }
}
