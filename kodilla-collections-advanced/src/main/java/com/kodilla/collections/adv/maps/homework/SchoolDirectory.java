package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.complex.Grades;
import com.kodilla.collections.adv.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal john = new Principal("John","Smith");
        Principal mark = new Principal("Mark","Jones");
        Principal thomas = new Principal("Thomas","Williams");

        School schoolA = new School("Primary school",Arrays.asList(12,16,22,10,8,27));
        School schoolB = new School("Secondary school",Arrays.asList(11,15,21,9,7,26));
        School schoolC = new School("Nursery",Arrays.asList(13,12,11,10,9,8));

        schools.put(john,schoolA);
        schools.put(mark,schoolB);
        schools.put(thomas,schoolC);

        for (Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println(schoolEntry.getKey().toString()+" jest dyrektorem szkoly: "+schoolEntry.getValue().getSchoolName()+" z liczba uczniow: "+schoolEntry.getValue().getAllStudents());
        }

    }
}
