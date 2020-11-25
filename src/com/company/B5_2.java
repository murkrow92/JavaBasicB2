package com.company;

import java.util.Scanner;

public class B5_2 {
    public static void main(String[] args) {
//        Student duc = new Student(20, "Duc", "Hanoi", 20.5f);
//        duc.printAccountBalance();
//
//        Student thuy = new Student(18, "Thuy", "Hanoi", 0.5f);
//        System.out.println("Truoc khi duoc cho tien");
//        thuy.printAccountBalance();
//
//        thuy.receiveBalance(100);
//        System.out.println("Sau khi duoc cho tien");
//        thuy.printAccountBalance();

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhap ten sinh vien:");
            String name = scanner.nextLine();
            Student student = new Student();
            student.setName(name);
        }

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }
}
