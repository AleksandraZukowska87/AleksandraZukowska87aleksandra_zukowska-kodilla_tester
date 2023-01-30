package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;

import java.util.ArrayList;

public class CarListApplication {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car audi = new Audi();
        cars.add(audi);
        for (int i =0; i<3; i++){
            cars.add(new Audi());
            cars.add(new Bmw());
            cars.add(new Ferrari());
        }

        for (Car car: cars){
            CarUtils.describeCar(car);
        }
        System.out.printf("Array length: " + cars.size());

        System.out.printf("\n-------------------------");

        cars.remove(1);
        cars.remove(audi);
        for (Car car: cars){
            CarUtils.describeCar(car);
        }
        System.out.printf("Array length: " + cars.size());
    }
}
