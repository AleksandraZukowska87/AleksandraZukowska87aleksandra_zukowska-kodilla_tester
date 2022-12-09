package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car{
    public int speed = 0;
    public Bmw(){ speed = 0;}
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing speed by 20");
        this.speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed by 15");
        this.speed -= 15;
    }
}
