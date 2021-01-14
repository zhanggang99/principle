package com.desing.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

public class Pig implements Cloneable {

    private String name;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); 默认浅克隆
        //深克隆  有问题？todo
        Pig pig = (Pig) super.clone();
        pig.birthDay= (Date) pig.birthDay.clone();
        return pig;
    }

    public Pig(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
}
