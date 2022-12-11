package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> classes = new ArrayList<>();

    public School(String schoolName, List<Integer> classes) {
        this.schoolName = schoolName;
        this.classes = classes;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAllStudents(){
        int sum = 0;
        for(Integer count : classes){
            sum+=count;
        }
        return sum;
    }


}
