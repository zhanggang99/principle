package com.desing.creational.singletion;

public enum EnumInstance {
    //INSTANCE;
    INSTANCE{
        protected void printTest(){
            System.out.println("test enum thmead");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
