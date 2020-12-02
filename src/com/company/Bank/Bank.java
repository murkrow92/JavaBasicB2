package com.company.Bank;

public class Bank {

    private float account;
    private int year;

    public Bank(float account, int year) {
        this.account = account;
        this.year = year;
    }

    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double total() {
        return 0;
    }
}
