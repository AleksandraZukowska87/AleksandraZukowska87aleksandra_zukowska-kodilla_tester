package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {

        double [] transakcje = {
                100.50,
                358.60,
                1200.0,
                -642.0,
                -3.50
        };

        double [] transakcje2 = {
                -45.42,
                -100.99,
                20.80,
                6.93,
                -40.26
        };
        CashMachine bankomat1 = new CashMachine(transakcje, 2570.21);
        CashMachine bankomat2 = new CashMachine(transakcje2, 5.50);

        CashMachine bankomaty []  = {bankomat1, bankomat2};

        Bank bank = new Bank(bankomaty);

        System.out.println(bank.zwrocSredniaWartoscWplaty());
        System.out.println(bank.zwrocSredniaWartoscWyplaty());
        System.out.println(bank.zwrocLiczbeTransakcjiZwiazanychZWyplata());
        System.out.println(bank.zwrocLiczbeTransakcjiZwiazanychZWplata());
        System.out.println(bank.zwrocCalkowityBilansZeWszystkichBankomatow());


    }
}
