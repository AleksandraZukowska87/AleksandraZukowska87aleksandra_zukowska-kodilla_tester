package com.kodilla.bank.homework;

public class CashMachine {

    //ZMIENNE
    //
    public double [] zrealizowaneTransakcje;

    private double saldo;


    public CashMachine(double [] zrealizowaneTransakcje, double saldo){
        this.zrealizowaneTransakcje = zrealizowaneTransakcje;
        this.saldo = saldo;

    }



    //FUNKCJE / METODY
    //
    public double zwrocSaldo(){
        return this.saldo;
    }

    public double zwrocLiczbeWykonanychTransakcji(double zrealizowaneTransakcje){
        return this.zrealizowaneTransakcje.length;
    }
}
