package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String[]args){
        OperatingSystem[] operatingSystems= {new Windows(2023),
                                             new Linux(2022)};
for ( int i=0 ; i < operatingSystems.length; i ++){
    operatingSystems [i].turnOn();
    operatingSystems [i].turnOff();
}
    }
}
