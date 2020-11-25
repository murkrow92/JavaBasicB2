package com.company;

public class Student extends Family {

    public Student(boolean isGood, boolean isPoor) {
        this.setGood(isGood);
        this.setPoor(isPoor);
    }

    public float total() {
        return 1000;
    }


}
