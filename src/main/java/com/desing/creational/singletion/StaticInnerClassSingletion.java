package com.desing.creational.singletion;

public class StaticInnerClassSingletion {
    private static class innerClass{
        private static StaticInnerClassSingletion staticInnerClassSingletion = new StaticInnerClassSingletion();

    }
    public static StaticInnerClassSingletion getInstance(){
        return innerClass.staticInnerClassSingletion;
    }
    //私有，防止外部调用
    private StaticInnerClassSingletion(){

    }
}
