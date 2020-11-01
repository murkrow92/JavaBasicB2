package com.company;

import java.util.Scanner;

public class B2_3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++) {

        }


    }


    public static int gt(int num) {
        int sum = 0;
        int count = 1;
        while (count <= num) {
            sum = sum + count;
            count = count + 1;
        }
        return sum;
    }


}
