package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 9;
        int b = 7;
        int result = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(16, result);
        if (correct)
            System.out.println(" metoda add dziala poprawnie dla liczb " + a + " oraz " + b);
        else {
            System.out.println(" metoda add nie dziala poprawnie dla licz " + a + " oraz " + b);

        }
        result = calculator.subtract(a,b);
        correct = ResultChecker.assertEquals(2, result);
        if (correct)
            System.out.println(" metoda subtract dziala poprawnie dla liczb " + a + " oraz " + b);
        else {
            System.out.println(" metoda subtract nie dziala poprawnie dla licz " + a + " oraz " + b);

        }

        result = calculator.square(a);
        correct = ResultChecker.assertEquals(81, result);
        if (correct)
            System.out.println(" metoda square dziala poprawnie dla liczby " + a );
        else {
            System.out.println(" metoda square nie dziala poprawnie dla liczby " + a );

        }

    }
}
