package com.company;

import java.util.Scanner;

public class B4_3 {
    public static void main(String[] args) {

        int defaultLength = 8;

        int[] numbers = new int[defaultLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Day so da nhap");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int currentNumber = numbers[i];
                int nextNumber = numbers[j];
                if (currentNumber > nextNumber) {
                    int tmp = currentNumber;
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }


        System.out.println("Sau khi sap xep:");
        for (int k = 0; k < numbers.length; k++) {
            System.out.println(numbers[k]);
        }
    }
}
