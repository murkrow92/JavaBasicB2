package com.company;

class MainTest {

    @org.junit.jupiter.api.Test
    void testValidTemperature() {
        test15IsInValidTemperature();
        test30IsValidTemperature();
        test35IsValidTemperature();
        test40IsValidTemperature();
        test45IsValidTemperature();
    }

    void test15IsInValidTemperature() {
        int temperature = 15;
        boolean isNotValid = Main.isValidTemperature(temperature);
        assert (!isNotValid);
    }

    void test30IsValidTemperature() {
        int temperature = 30;
        boolean isValid = Main.isValidTemperature(temperature);
        assert (isValid);
    }


    void test35IsValidTemperature() {
        int temperature = 35;
        boolean isValid = Main.isValidTemperature(temperature);
        assert (isValid);
    }

    void test40IsValidTemperature() {
        int temperature = 40;
        boolean isValid = Main.isValidTemperature(temperature);
        assert (isValid);
    }

    void test45IsValidTemperature() {
        int temperature = 45;
        boolean isInValid = Main.isValidTemperature(temperature);
        assert (!isInValid);
    }

}