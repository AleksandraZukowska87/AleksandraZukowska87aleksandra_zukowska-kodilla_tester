package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        Car bmw = new Bmw();
        Car audi = new Audi();

        Car cars[] = {ferrari,bmw,audi};

        for (int i=0;i<cars.length;i++){
            doRace(cars[i]);
        }
    }

    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
