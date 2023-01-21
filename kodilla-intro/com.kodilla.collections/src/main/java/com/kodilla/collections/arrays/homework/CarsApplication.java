package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Car car;
        if (randomNumber == 0) {
            car = new Ferrari();
        } else if (randomNumber == 1) {
            car = new Bmw();
        } else {
            car = new Audi();
        }
        int randomSpeed = random.nextInt(10) + 1;
        for (int i = 0; i < randomSpeed; i++) {
            car.increaseSpeed();
        }
        return car;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomSize = random.nextInt(15) + 1;
        Car[] cars = new Car[randomSize];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
