package com.company.Ngoc;

import java.util.Scanner;


import java.util.Scanner;
public class bai2 {
    public float Techcombank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn gửi:");
        int money  = scanner.nextInt();
        System.out.println( "Số tiền bạn muốn gửi là: " + money+ " triệu VND");
        System.out.println("Nhập số năm bạn muốn gửi tiết kiệm:");
        int year  = scanner.nextInt();
        System.out.println( "Bạn muốn gửi :" + year+ " năm");
        float laiSuat = 0.05f;
        //Tinh lai suat
        float laiThuDuoc = money;
        laiThuDuoc = money + money * laiSuat * year;
        System.out.println("Tổng Số tiền Nhận sau "+ year +" năm là: "+ laiThuDuoc);
        return laiThuDuoc;

    }

    public float Vietcombank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn gửi:");
        int money  = scanner.nextInt();
        System.out.println( "Số tiền bạn muốn gửi là: " + money+ " triệu VND");
        System.out.println("Nhập số năm bạn muốn gửi tiết kiệm:");
        int year  = scanner.nextInt();
        System.out.println( "Bạn muốn gửi :" + year+ " năm");
        float laiSuat = 0.05f;
        //Tinh lai suat
        float laiThuDuoc = money;

        for( int i = 1;i<= year;i++) {
            laiThuDuoc = laiThuDuoc + laiThuDuoc * laiSuat;
        }
        System.out.println("Tổng Số tiền Nhận sau "+ year +" năm là: "+ laiThuDuoc);
        return laiThuDuoc;
    }

    public float ACB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn gửi:");
        int money  = scanner.nextInt();
        System.out.println( "Số tiền bạn muốn gửi là: " + money+ " triệu VND");
        System.out.println("Nhập số năm bạn muốn gửi tiết kiệm:");
        int year  = scanner.nextInt();
        System.out.println( "Bạn muốn gửi :" + year+ " năm");
        //Tinh lai suat
        float laiThuDuoc = money;

        for(int i = 1; i<= year; i++) {
            laiThuDuoc = laiThuDuoc + laiThuDuoc * 10 / 100 - 5;
        }
        System.out.println("Tổng Số tiền Nhận sau "+ year +" năm là: "+ laiThuDuoc);
        return laiThuDuoc;
    }

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        float sum = 0;
        bai2 bank = new bai2();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số ngân hàng bạn muốn gửi tiền: ");
            n = scanner.nextInt();
        } while (n < 0);
        int array[] = new int[n];
        System.out.println("Nhập các ngân hàng: ");
        System.out.println("1: Techcom");
        System.out.println("2: Vietcom");
        System.out.println("3: ACB");


        for (int i = 0; i < n; i++) {
            System.out.print("Ngân hàng thứ " + i + ": ");
            array[i] = scanner.nextInt();
            if (array[i]   == 1) {
                System.out.println( "Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng Techcombank ");
                float tienLai = bank.Techcombank();
                sum = sum + tienLai;
            }else if(array[i] ==2){
                System.out.println( "Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng Vietcombank");
                float tienLai = bank.Vietcombank();
                sum = sum + tienLai;

            }else if(array[i]  ==3){
                System.out.println( "Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng ACB");
                float tienLai = bank.ACB();
                sum = sum + tienLai;

            }
        }
        System.out.println( "Tổng số tiền chú B thực nhận sau khi đáo hạn ở tất cả các ngân hàng:"+ sum);

    }

}