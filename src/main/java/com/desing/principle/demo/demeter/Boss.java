package com.desing.principle.demo.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void CommandCheckCourseNumber(TeamLeader teamLeader){
//        boss和course不是朋友关系，boss不需要知道course
//        List<Course> courses= new ArrayList<>();
//        for (int i=0;i<20;i++){
//            courses.add(new Course());
//        }
        //teamLeader.checkNumberOfCourses(courses);
        teamLeader.checkNumberOfCourses();
    }
}
