package com.kodilla.collections.interfaces.homework;

public interface Car {
    int getSpeed();
    void increaseSpeed();
    void decreaseSpeed();

    private static void getSpeed(Car car){
        System.out.println(car.getSpeed());
    }
    private static void increaseSpeed(Car car){
        car.increaseSpeed();
    }
    private static void decreaseSpeed(Car car){
        car.decreaseSpeed();
    }
}
