package com.kodilla.collections.interfaces;

public class Circle implements Shape {
public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI *this.radius*this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
