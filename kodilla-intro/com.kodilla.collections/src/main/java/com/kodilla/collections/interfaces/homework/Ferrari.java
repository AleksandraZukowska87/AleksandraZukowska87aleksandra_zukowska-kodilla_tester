package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {
    int speed =0;
    public Ferrari(){
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing speed by 40");
        this.speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed by 10");
        this.speed -= 10;
    }
}
