package com.desing.creational.builder.V2;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Data
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder builder) {
        this.courseName=builder.courseName;
        this.courseArticle= builder.courseArticle;
        this.coursePPT= builder.coursePPT;
        this.courseQA= builder.courseQA;
        this.courseVideo= builder.courseVideo;
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String name){
            this.courseName=name;
            return this;
        }
        public CourseBuilder buildCoursePPT(String ppt){
            this.coursePPT=ppt;
            return this;
        }
        public CourseBuilder buildCourseVideo(String video){
            this.courseVideo=video;
            return this;
        }
        public CourseBuilder buildCourseArticle(String article){
            this.courseArticle=article;
            return this;
        }
        public CourseBuilder buildCourseQA(String qa){
            this.courseQA=qa;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
