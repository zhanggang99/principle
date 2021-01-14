package com.desing.creational.prototype;

import lombok.Data;

@Data
public class Mail implements Cloneable {
    private String name;
    private String mailAddress;
    private String content;

    public Mail() {
        System.out.println("mail called contructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone is called!");
        return super.clone();
    }
}
