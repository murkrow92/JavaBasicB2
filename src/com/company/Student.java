package com.company;

public class Student extends People {
    private String universityName;

    public Student() {

    }

    public Student(String universityName) {
        this.universityName = universityName;
        System.out.println(this.name);
    }

}
