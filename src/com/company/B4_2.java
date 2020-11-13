package com.company;

import java.util.Scanner;

public class B4_2 {
    public static void main(String[] args) {

        int defaultLength = 4;

        int[] numbers = new int[defaultLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum = sum + numbers[j];
        }

        System.out.println("Tong gia tri cua mang la: " + sum);
        double average = (float) sum / numbers.length;

        System.out.println("Average:" + average);


        int[] lowerNumbers = new int[defaultLength];
        int count = 0;

        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] <= average) {
                lowerNumbers[count] = numbers[k];
                count++;
            }
        }

        System.out.println("Tong so phan tu:" + count);

        int maxNumberOfLowerNumbers = lowerNumbers[0];
        for (int l = 0; l < count; l++) {
            if (maxNumberOfLowerNumbers < lowerNumbers[l]) {
                maxNumberOfLowerNumbers = lowerNumbers[l];
            }
        }

        System.out.println("So gan nhat voi gia tri trung binh la " + maxNumberOfLowerNumbers);


    }
}
