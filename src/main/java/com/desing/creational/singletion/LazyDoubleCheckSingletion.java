package com.desing.creational.singletion;

public class LazyDoubleCheckSingletion {
    //volatile解决重排问题
    //1.分配内存给这个对象。
    //2.初始化对象
    //3.设置instane指向分配的内存。  其中2，3可能在执行中会调换顺序，加入volatile解决。
    private volatile static LazyDoubleCheckSingletion instance=null;
    private LazyDoubleCheckSingletion(){}

    public static LazyDoubleCheckSingletion getInstance(){
        if (instance==null){
            synchronized (LazyDoubleCheckSingletion.class){
                instance=new LazyDoubleCheckSingletion();
            }
        }
        return instance;
    }
}
