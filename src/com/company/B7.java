package com.company;

//import java.util.ArrayList;
//import java.util.List;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May nhap so sinh vien di:");
        int studentCount = scanner.nextInt();
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < studentCount; i++) {
            Student student = inputStudent();
            students.add(student);
        }
        for (Student student : students) {
            outputStudent(student);
        }


        for (Student student : students) {
            if (student.isPoor()) {
                System.out.println("============Sinh vien ngheo==============");
                outputStudent(student);
            }
        }

        for (Student student : students) {
            if (student.isGood()) {
                System.out.println("============Sinh vien co cong==============");
                outputStudent(student);
            }
        }

        for (Student student : students) {
            if (!student.isGood() && !student.isPoor()) {
                System.out.println("============Sinh vien co dieu kien==============");
                outputStudent(student);
            }
        }
    }

    private static Student inputStudent() {

        Scanner scanner = new Scanner(System.in);
        Student student;
        System.out.println("Ban nhap truong 1 FTU 2 NEU");
        int university = scanner.nextInt();
        if (university == 1) {
            student = new StudentFTU();
        } else {
            student = new StudentNEU();
        }

        System.out.println("May nhap ten di:");
        String name = scanner.next();
        student.setName(name);


        System.out.println("May nhap tuoi di:");
        int age = scanner.nextInt();
        student.setAge(age);


        System.out.println("May nhap dia chi di:");
        String address = scanner.next();
        student.setAddress(address);

        int isPoor = inputInteger("Nha may co ngheo khong 1 Co 2 Khong");
        student.setPoor(isPoor == 1);

        int isGood = inputInteger("Nha may co cong khong 1 Co 2 Khong");
        student.setGood(isGood == 1);

        return student;
    }

    private static int inputInteger(String placeholder) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(placeholder);
            try {
                return input.nextInt();
            } catch (java.util.InputMismatchException e) {
                input.nextLine();
            }
        }
    }

    private static void outputStudent(Student student) {
        System.out.println("Ten truong may la: " + student.getSchoolName());
        System.out.println("Ten may la: " + student.getName());
        System.out.println("Tuoi may la: " + student.getAge());
        System.out.println("Dia chi may la: " + student.getAddress());
        System.out.println("May co ngheo khong " + student.isPoor());
        System.out.println("Nha may co cong khong " + student.isGood());
    }
}
