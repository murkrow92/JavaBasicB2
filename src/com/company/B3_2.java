package com.company;

import java.util.Scanner;

public class B3_2 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = scanner.nextInt();
            System.out.println("Phan tu ban da nhap:" + numbers[i]);
        }

        int[] govNumbers = new int[6];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (isGovernmentNumber(current)) {
                govNumbers[count] = current;
                count++;
            }

        }

        for (int j = 0; j < govNumbers.length; j++) {
            System.out.println("So chinh phuong:");
            System.out.println(govNumbers[j]);
        }

    }

    public static boolean isGovernmentNumber(int number) {
        for (int current = 1; current < number / 2; current++) {
            if (current * current == number) {
                return true;
            }
        }
        return false;
    }


}
