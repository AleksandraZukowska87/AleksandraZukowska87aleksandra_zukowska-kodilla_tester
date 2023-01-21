package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;


public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ferrari)
            return "Ferrari";
        else if (car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown car name";
    }
}
