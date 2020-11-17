package com.company;

import java.util.Scanner;

public class B3HN {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = scanner.nextInt();
            System.out.println("Sô vừa nhập luôn " + numbers[i]);
        }

        int[] square = new int[6];
        int count = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (goNumber(numbers[k])) {
                square[count] = numbers[k];
                count++;
            }
        }


        System.out.println("Số chính phương");
        for (int k = 0; k < count; k++) {
            System.out.println(square[k]);
        }
    }

    public static boolean goNumber(int number) {
        for (int current = 2; current <= number / 2; current++) {
            if (current * current == number) {
                return true;
            }
        }
        return false;
    }
}




