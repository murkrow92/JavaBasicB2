package com.company;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();
        }

        int[] output = new int[3];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isGovernmentNumber(numbers[i])) {
                output[count] = numbers[i];
            }
        }

        for (int j = 0; j < output.length; j++) {
            System.out.println(output[j]);
        }
    }


    public static boolean isGovernmentNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}
