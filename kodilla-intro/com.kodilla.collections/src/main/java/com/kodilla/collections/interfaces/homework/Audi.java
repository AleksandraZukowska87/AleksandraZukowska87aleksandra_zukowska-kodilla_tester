package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    public int speed = 0;
    public Audi(){speed = 0;}
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing speed by 10");
        this.speed += 10;
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed by 10");
        this.speed -= 10;
    }
}
