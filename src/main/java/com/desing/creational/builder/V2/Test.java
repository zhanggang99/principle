package com.desing.creational.builder.V2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("zt").buildCoursePPT("ppt").buildCourseVideo("mp4").buildCourseArticle("html").buildCourseQA("qa").build();
        System.out.println(course);
    }
}
