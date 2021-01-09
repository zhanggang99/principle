package com.desing.creational.singletion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class T implements Runnable  {
    @Override
    public void run() {
        LazySingletion lazySingletion=LazySingletion.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingletion);

    }
}
