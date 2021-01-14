package com.desing.creational.singletion;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstall = new InheritableThreadLocal<>(){
        @Override
        protected Object initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstall.get();
    }
}
