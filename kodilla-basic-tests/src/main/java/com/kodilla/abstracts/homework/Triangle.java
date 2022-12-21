package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width,double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse  = hypotenuse;
    }

    @Override
    public double getArea() {
        return this.width * this.height / 2;
    }

    @Override
    public double getPerimeter() {
        return this.width + this.height + this.hypotenuse;
    }
}
