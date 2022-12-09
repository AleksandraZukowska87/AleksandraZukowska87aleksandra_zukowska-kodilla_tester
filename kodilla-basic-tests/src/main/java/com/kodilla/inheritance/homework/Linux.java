package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{
    private int rokWydania;
    public Linux ( int rokWydania){
        super(rokWydania);
        this.rokWydania = rokWydania;

    }
    @Override
    public void turnOn () {
        System.out.println (" turning On Linux " );
    }
    @Override
    public void turnOff () {
        System.out.println(" turning Off Linux");
    }
}
