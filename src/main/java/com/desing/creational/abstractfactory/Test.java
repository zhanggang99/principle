package com.desing.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        Video video=courseFactory.getVideo();
        Article article=courseFactory.getArticle();
        video.product();
        article.product();
    }
}
