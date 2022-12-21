package com.kodilla.abstracts.homework;

public abstract class Job {
    String name ;
    double salary ;
    String responsibilities;
    public Job (double salary, String responsibilities, String name){
        this.salary=salary;
        this.responsibilities=responsibilities;
        this.name=name;

    }
}
