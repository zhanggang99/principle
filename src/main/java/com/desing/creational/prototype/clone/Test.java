package com.desing.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birth =new Date(0L);
        Pig pig1 = new Pig("qq",birth);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.setBirthDay(new Date(5555L));
        System.out.println(pig1);
        System.out.println(pig2);

    }
}
