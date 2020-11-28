package com.company;

public class StudentFTU extends Student {

    public StudentFTU() {
        this.setSchoolName("FTU");
    }

    public float total() {
        float original = 10000;
        float discountRate = 0;
        if (this.isGood()) {
            discountRate = discountRate + 0.1f;
        }

        if (this.isPoor()) {
            discountRate = discountRate + 0.3f;
        }
        return original - discountRate * original;
    }
}
