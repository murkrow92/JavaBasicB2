package com.company;

import java.util.Scanner;

public class B3_3 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = scanner.nextInt();
            System.out.println("Phan tu ban da nhap:" + numbers[i]);
        }

        int maxNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("So lon nhat trong day so la " + maxNumber);
    }


}
