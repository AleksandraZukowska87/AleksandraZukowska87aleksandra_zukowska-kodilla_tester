package com.kodilla.basic_assertion;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(14,28));
        System.out.println(calculator.subtract(56,28));
    }
    public Calculator () {

    }
    double  add (double number1 , double number2){
        return number1 + number2 ;

    }
    double subtract ( double number1, double number2){
        return number1 - number2;
    }
    double square (double number ){
        return number * number ;

    }

}