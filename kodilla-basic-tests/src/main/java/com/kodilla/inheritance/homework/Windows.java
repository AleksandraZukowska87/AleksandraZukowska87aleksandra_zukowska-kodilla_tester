package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{
    int rokWydania;
    public Windows ( int rokWydania){
        super(rokWydania);
        this.rokWydania = rokWydania;
    }
    @Override
    public void turnOn () {
        System.out.println( "turning On Windows");
    }
    @Override
    public void turnOff () {
        System.out.println( " turning Off Windows");
    }

}
