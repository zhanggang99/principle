package com.desing.principle.demo.openclose;

public class JavaDiscountCourse extends JavaCourcse {
    public JavaDiscountCourse(Integer id, String name, Double prise) {
        super(id, name, prise);
    }

    public Double getOrininPrise(){
        return super.getPrise();
    }
    @Override
    public Double getPrise() {
        return super.getPrise()*0.8;
    }
}
