package com.kodilla.basic_assertion;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(14,28));
        System.out.println(calculator.subtract(56,28));
    }
    public Calculator () {

    }
    int  add (int number1 , int number2){
        return number1 + number2 ;

    }
    int subtract ( int number1, int number2){
        return number1 - number2;
    }
    int square (int number ){
        return number * number ;

    }

}
