package com.company.Bank;

public class Vietcombank extends Bank {

    public Vietcombank(float account, int year) {
        super(account, year);
    }

    public double total() {
        float account = this.getAccount();
        int year = this.getYear();
        double sum = account;
        for (int i = 0; i < year; i++) {
            sum = sum + 0.05 * sum;
        }
        return sum;
    }

}
