package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(23.6),
                          new Square(50.2),
                          new Triangle(8,10,12)};

        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());

        }





















        Informatyk informatyk= new Informatyk(8.000,"Programowanie", "Informatyk");
        Spawacz spawacz= new Spawacz(6.000,"Spawanie","Spawacz");
        Kucharz kucharz= new Kucharz(4.000,"Gotowanie", "Kucharz");
        Person person= new Person("Alicja",35,kucharz);
        person.showResponsibilities();

    }
}
