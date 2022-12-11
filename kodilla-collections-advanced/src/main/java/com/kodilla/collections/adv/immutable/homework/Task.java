package com.kodilla.collections.adv.immutable.homework;

public class Task {
    protected String title;
    protected Integer duration;

    public Task(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }
}
