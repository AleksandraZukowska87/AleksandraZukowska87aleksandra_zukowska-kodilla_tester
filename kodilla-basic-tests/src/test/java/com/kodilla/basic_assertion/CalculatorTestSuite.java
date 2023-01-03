package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 6;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(4, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 10.26;
        double squareResult = calculator.square(a);
        assertEquals(105.2676,squareResult);
    }

}