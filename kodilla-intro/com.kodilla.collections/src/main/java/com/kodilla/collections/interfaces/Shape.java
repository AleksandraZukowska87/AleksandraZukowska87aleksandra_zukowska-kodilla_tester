package com.kodilla.collections.interfaces;

public interface Shape {

    double getArea();

    double getPerimeter();

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }

}
