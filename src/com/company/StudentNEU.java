package com.company;

public class StudentNEU extends Student {

    public StudentNEU() {
        this.setSchoolName("NEU");
    }

    public float total() {
        float original = 7000;
        float discountRate = 0;


        if (this.isPoor()) {
            discountRate = 0.3f;
        }

        if (this.isGood()) {
            discountRate = 0.5f;
        }

        return original - discountRate * original;
    }
}
