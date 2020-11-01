package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {
        checkGender();

//        String builder = "";
//        int money = 1323123;
//        while (money > 1000) {
//            int modulo = money % 1000;
//            money = money / 1000;
//            builder = "." + modulo + builder;
//        }
//        builder = money + builder;
//        System.out.println("Money:" + builder)

    }

    public static void checkGender() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("Please enter your gender (1:Male 2:Female Other:LGBT):");
            int gender = scanner.nextInt();
            if (gender == 2) {
                checkAgeOfFemale();
            } else {
                System.out.println("Cut");
            }
            count++;
        }

    }

    public static void checkAgeOfFemale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        if (age > 18 && age <= 30) {
            System.out.println("Chuc mung ban di ban hoa");
        } else {
            System.out.println("Cut, may khong du tuoi ban hoa");
        }
    }

    public static void printName() {
        String[] names = new String[]{"Hello", "World", "Hai"};
        int[] serials = new int[10];
        int[] numbers = new int[]{1, 2, 3, 4, 5};
    }


    public static boolean isValidTemperature(float temperature) {
        return temperature <= 40 && temperature > 15;
    }


}
