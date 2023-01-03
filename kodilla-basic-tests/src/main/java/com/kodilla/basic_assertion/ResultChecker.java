package com.kodilla.basic_assertion;

import java.math.BigDecimal;

public class ResultChecker {
    public static boolean assertEquals( int expected, int actual) {
        return expected == actual;
    }

    public static boolean assertEquals(double expected, double actual){
        return expected == actual;
    }
}
