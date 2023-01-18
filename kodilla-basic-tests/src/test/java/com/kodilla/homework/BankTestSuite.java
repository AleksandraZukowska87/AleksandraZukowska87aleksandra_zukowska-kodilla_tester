package com.kodilla.homework;


import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    public double [] zrealizowaneTransakcje1 = {
            256.0,
            1890.0,
            17236.45
    };

    public double [] zrealizowaneTransakcje2 = {
            476.32,
            2654.42,
            -86.62
    };

    public CashMachine bankomat1 = new CashMachine(zrealizowaneTransakcje1, 100.0);
    public CashMachine bankomat2 = new CashMachine(zrealizowaneTransakcje2, 1682.0);
    public CashMachine [] bankomaty = {bankomat1,bankomat2};
    public Bank bank = new Bank(bankomaty);


    @Test
    public void powinnoZwrocicCaleSaldoZeWszystkichBankomatow(){
        assertEquals(1782.0, this.bank.zwrocCalkowityBilansZeWszystkichBankomatow());
    }
    @Test
    public void powinnoZwrocicLiczbeTransakcjiZwiazanychZWyplata() {
        assertEquals(1, this.bank.zwrocLiczbeTransakcjiZwiazanychZWyplata());
    }
    @Test
    public void powinnoZwrocicLiczbeTransakcjiZwiazanychZWplata(){
        assertEquals(5, this.bank.zwrocLiczbeTransakcjiZwiazanychZWplata());
    }
    @Test
    public void powinnoZwrocicSredniaWartoscWyplaty() {
        assertEquals(-86.62, this.bank.zwrocSredniaWartoscWyplaty());
    }
    @Test
    public void powinnoZwrocicSredniaWartoscWplaty(){
        assertEquals(22513.19, this.bank.zwrocSredniaWartoscWplaty(), 0.01);
    }
}
