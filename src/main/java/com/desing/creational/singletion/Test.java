package com.desing.creational.singletion;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //LazySingletion lazySingletion= LazySingletion.getInstance();
        //Thread t1 = new Thread(new T());
        //Thread t2 = new Thread(new T());
        //t1.start();
        //t2.start();
        //System.out.println(lazySingletion);
        //System.out.println("end");



//        HungrySingletion instance=HungrySingletion.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletion"));
//        oos.writeObject(instance);
//
//        File file=new File("singletion");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingletion newInstance = (HungrySingletion) ois.readObject();

        Class objectClass = HungrySingletion.class;
        Constructor constructor=objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingletion newInstance = (HungrySingletion) constructor.newInstance();

        HungrySingletion instance = HungrySingletion.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}
