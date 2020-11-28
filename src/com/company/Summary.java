package com.company;

public class Summary {
    public static void main(String[] args) {

    }

    public static boolean checkCondition(int temperature){
        if (temperature >= 35) {
            return false;
        } else if (temperature <= 15) {
            return false;
        } else {
            return true;
        }
    }
}
