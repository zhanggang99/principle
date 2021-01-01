package com.desing.principle.demo.singlereposibity;

public class Bird {
    public void mainMoveMode(String name){
        if ("鸵鸟".equals(name))
            System.out.println(name+"行走");
        else
            System.out.println(name+"飞翔");
    }
}
