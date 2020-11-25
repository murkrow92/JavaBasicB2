package com.company;

public class Student {
    private int age;
    private String name;
    private String address;
    private float accountBalance;

    private int gender;

    public Student() {

    }

    public Student(int age, String name, String address, float accountBalance) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.accountBalance = accountBalance;

    }

    public void printAccountBalance() {
        System.out.println("Ban co " + this.accountBalance);
    }

    public void receiveBalance(int money) {
        this.accountBalance = this.accountBalance + money;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
