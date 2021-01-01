package com.desing.principle.demo.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> list= new ArrayList<>();
        for (int i=0;i<20;i++){
            list.add(new Course());
        }
        System.out.println("课程的总数是："+list.size());
    }
}
