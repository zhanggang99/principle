package com.desing.principle.demo.dependenceversion;

public class ZhbStudy {
//    public void studyJava(){
//        System.out.println("zbh 学习 java");
//    }
//    public void studyCSS(){
//        System.out.println("zbh 学习 css");
//    }

    //V2 方法注入
//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }
    public void studyCourse(){
        this.iCourse.studyCourse();
    }
    //v3 构造器注入
//    private ICourse iCourse;
//
//    public ZhbStudy(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }


    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

}
