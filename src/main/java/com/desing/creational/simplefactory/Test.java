package com.desing.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        //Video video=new JavaVideo();
        //v2版本
//        VideoFactory videoFactory= new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video==null)
//            return ;
//        video.product();

        //v3 反射
        VideoFactory videoFactory= new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video==null)
            return;
        video.product();
    }
}
