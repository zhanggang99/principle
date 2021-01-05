package com.desing.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach= new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java", "ppt.ppt", "mp.mp4", "ddd.html", "qa");
        System.out.println(course);
    }

}
