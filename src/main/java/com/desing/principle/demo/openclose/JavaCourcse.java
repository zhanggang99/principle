package com.desing.principle.demo.openclose;

public class JavaCourcse implements ICourse {

    private Integer Id;
    private String name;
    private Double prise;

    public JavaCourcse(Integer id, String name, Double prise) {
        this.Id = id;
        this.name = name;
        this.prise = prise;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrise() {
        return this.prise;
    }
}
