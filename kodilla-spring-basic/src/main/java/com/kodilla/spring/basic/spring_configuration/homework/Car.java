package com.kodilla.spring.basic.spring_configuration.homework;
import java.time.LocalTime;

public interface Car {

    default boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(7, 0));
    }

    String getCarType();
}
