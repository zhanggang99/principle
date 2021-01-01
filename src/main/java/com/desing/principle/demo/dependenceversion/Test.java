package com.desing.principle.demo.dependenceversion;

public class Test {
//    v1
//    public static void main(String[] args) {
//        ZhbStudy zhb = new ZhbStudy();
//        zhb.studyCSS();
//    }
    //v2
//    public static void main(String[] args) {
//        ZhbStudy zhbStudy =new ZhbStudy();
//        zhbStudy.studyCourse(new JavaCourse());
//        zhbStudy.studyCourse(new CssCourse());
//        zhbStudy.studyCourse(new PythonCourse());
//    }
    //v3 构造器注入
//    public static void main(String[] args) {
//        ZhbStudy zhbStudy= new ZhbStudy(new JavaCourse());
//        zhbStudy.studyCourse();
//    }
    //v4 set注入
    public static void main(String[] args) {
        ZhbStudy zhbStudy= new ZhbStudy();
        zhbStudy.setiCourse(new JavaCourse());
        zhbStudy.studyCourse();
        zhbStudy.setiCourse(new CssCourse());
        zhbStudy.studyCourse();
    }
}
