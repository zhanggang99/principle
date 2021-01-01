package com.desing.principle.demo.singlereposibity;

public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();//退款
}
