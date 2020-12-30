package com.desing.principle.demo.openclose;

public class Test {
    public static void main(String[] args) {
        //ICourse java = new JavaCourcse(33, "java", 43d);
        ICourse java = new JavaDiscountCourse(33, "java", 43d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)java;
        System.out.println(java.getId()+java.getName()+"原价："+javaDiscountCourse.getOrininPrise()+"打折价："+java.getPrise());
    }
}
