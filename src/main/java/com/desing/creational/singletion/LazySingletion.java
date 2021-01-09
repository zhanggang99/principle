package com.desing.creational.singletion;

import org.springframework.context.annotation.Lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LazySingletion {
    private static LazySingletion lazySingletion = null;
    private static boolean flag = true;

    private LazySingletion() {
//        if (flag){
//            flag=false;
//        }else{
//            if (lazySingletion!=null){
//                throw  new RuntimeException("单例构造器禁止调用");
//            }
//        }
        if (lazySingletion != null)
            throw new RuntimeException("单例构造器禁止调用");

    }

    //synchronized加在静态方法上，表示锁的类的class文件。如果没有static，则表示锁的堆内存的对象。
    //public synchronized static LazySingletion getInstance(){
    public synchronized static LazySingletion getInstance() {
        //synchronized 这样与上面一样。
        synchronized (LazySingletion.class) {
            if (lazySingletion == null)
                lazySingletion = new LazySingletion();
        }
        return lazySingletion;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazySingletion.class;
//        Constructor constructor=objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        LazySingletion o1 = LazySingletion.getInstance();
//
//        Field flag=o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//        LazySingletion o2= (LazySingletion) constructor.newInstance();
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1==o2);
//
//
//    }
}
