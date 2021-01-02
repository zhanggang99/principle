package com.desing.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory= new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        if (video==null)
            return;
        video.product();
    }
}
