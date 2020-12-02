package com.company.Ngoc;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn gửi:");
        int money = scanner.nextInt();
        System.out.println("Số tiền bạn muốn gửi là: " + money + " triệu VND");
        //
        System.out.println("========================================================================================");
        System.out.println("Chọn ngân hàng muốn gửi");
        System.out.println("1: Techcom");
        System.out.println("2: Vietcom");
        System.out.println("3: ACB");
        int bank = scanner.nextInt();
        if (bank == 1) {
            System.out.println("Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng Techcombank ");
        } else if (bank == 2) {
            System.out.println("Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng Vietcombank");
        } else if (bank == 3) {
            System.out.println("Bạn vừa chọn ngân hàng gửi tiền vào Ngân hàng ACB");
        }
        System.out.println("========================================================================================");

        //
        System.out.println("Nhập số năm bạn muốn gửi tiết kiệm:");
        int year = scanner.nextInt();

        System.out.println("Bạn muốn gửi :" + year + " năm");

        //
        float lai = 0.05f;

        //Tinh lai suat
        float tongTien = money;
        switch (bank) {
            case 1:  // Techcom
                tongTien = tongTien + money * lai * year;
                break;
            case 2:  //Vietcom
                for (int i = 1; i <= year; i++) {
                    tongTien = tongTien + tongTien * lai;
                }
                break;
            case 3:  // ACB
                for (int i = 1; i <= year; i++) {
                    tongTien = tongTien + tongTien * 10 / 100 - 5;
                }
                break;
            default:
                break;
        }

        System.out.println("========================================================================================");
        System.out.println("Tổng Số tiền Nhận sau " + year + " năm là: " + tongTien);

    }

}