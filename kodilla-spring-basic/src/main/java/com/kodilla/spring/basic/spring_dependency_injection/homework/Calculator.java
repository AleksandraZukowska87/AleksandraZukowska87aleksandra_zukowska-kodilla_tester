package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.display(val);
        return val;
    }

    public double subtract(double a, double b) {
        double val = a - b;
        display.display(val);
        return val;
    }

    public double multiply(double a, double b) {
        double val = a * b;
        display.display(val);
        return val;
    }

    public double divide(double a, double b) {
        double val = a / b;
        display.display(val);
        return val;
    }
}
