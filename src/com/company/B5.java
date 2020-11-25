package com.company;

import java.util.Scanner;

public class B5 {

    //fields, attribute
    //methods, functions


    public static void main(String[] args) {
        int[] numbers = inputNumbers();
        System.out.println("Day so ban da nhap");
        printNumbers(numbers);
        int[] reversedNumbers = reverseNumbers(numbers);
        System.out.println("Day so dao nguoc");
        printNumbers(reversedNumbers);
    }

    private static int[] inputNumbers() {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }


    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static int[] reverseNumbers(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < numbers.length / 2; i++) {
            int currentNumber = numbers[i];
            int next = length - i - 1;
            int nextNumber = numbers[next];
            int tmp = currentNumber;
            numbers[i] = nextNumber;
            numbers[next] = tmp;
        }
        return numbers;
    }


}
