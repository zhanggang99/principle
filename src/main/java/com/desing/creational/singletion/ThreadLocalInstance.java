//package com.desing.creational.singletion;
//
//public class ThreadLocalInstance {
//    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstall = new ThreadLocal<ThreadLocalInstance>(){
//        @Override
//        protected Object initialValue() {
//            return new ThreadLocalInstance();
//        }
//    };
//
//    private ThreadLocalInstance() {
//    }
//    public static ThreadLocalInstance getInstance(){
//        return threadLocalInstall.get();
//    }
//}
