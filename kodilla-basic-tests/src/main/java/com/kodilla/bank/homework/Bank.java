package com.kodilla.bank.homework;

import javax.swing.plaf.PanelUI;

public class Bank {
    private CashMachine[] bankomaty;


    public Bank(CashMachine[] bankomaty){
        this.bankomaty = bankomaty;

    }


    public double zwrocCalkowityBilansZeWszystkichBankomatow(){
        double bilans = 0;
        for(int i = 0; i < this.bankomaty.length; i++){
            bilans += this.bankomaty[i].zwrocSaldo();
        }
        return bilans;
    }
    public int zwrocLiczbeTransakcjiZwiazanychZWyplata(){
        int transakcje = 0;
        for (int i = 0; i < this.bankomaty.length; i++){
            for (int j = 0; j < this.bankomaty[i].zrealizowaneTransakcje.length; j++){
                if(this.bankomaty[i].zrealizowaneTransakcje[j] < 0){
                    transakcje++;
                }
            }
        }
        return transakcje;
    }

    public int zwrocLiczbeTransakcjiZwiazanychZWplata(){
        int transakcje = 0;
        for (int i = 0; i < this.bankomaty.length; i++){
            for (int j = 0; j < this.bankomaty[i].zrealizowaneTransakcje.length; j++){
                if(this.bankomaty[i].zrealizowaneTransakcje[j] > 0){
                    transakcje++;
                }
            }
        }
        return transakcje;

    }
    public double zwrocSredniaWartoscWyplaty(){
        double sredniaWyplaty =0;
        double wszystkieWyplaty =0;
        double iloscTransakcji = 0;

        for (int i = 0; i < this.bankomaty.length; i++){
            for(int j = 0; j < this.bankomaty[i].zrealizowaneTransakcje.length; j++){
                if(this.bankomaty[i].zrealizowaneTransakcje[j] < 0){
                    wszystkieWyplaty += this.bankomaty[i].zrealizowaneTransakcje[j];
                }
            }
        }

        iloscTransakcji = zwrocLiczbeTransakcjiZwiazanychZWyplata();

        sredniaWyplaty = wszystkieWyplaty / iloscTransakcji ;

        return sredniaWyplaty;
    }
    public double zwrocSredniaWartoscWplaty(){
        double sredniaWyplaty =0;
        double wszystkieWyplaty =0;
        double iloscTransakcji = 0;

        for (int i = 0; i < this.bankomaty.length; i++){
            for(int j = 0; j < this.bankomaty[i].zrealizowaneTransakcje.length; j++){
                if(this.bankomaty[i].zrealizowaneTransakcje[j] > 0){
                    wszystkieWyplaty += this.bankomaty[i].zrealizowaneTransakcje[j];
                }
            }
        }

        iloscTransakcji = zwrocLiczbeTransakcjiZwiazanychZWyplata();

        sredniaWyplaty = wszystkieWyplaty / iloscTransakcji ;

        return sredniaWyplaty;
    }
}
