package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B2_2 {

    public static void main(String[] args) {
        int money = 2156234;
        String builder = "";
        while (money > 1000) {
            System.out.println("so tien sau khi chia:" + money );
            int modulo = money % 1000;
            System.out.println("Phan du:" + modulo);
            money = money / 1000;
            builder = "." + modulo + builder;
            System.out.println("Sau khi cong chuoi:" + builder);
            System.out.println("======================");

        }
        builder = money + builder;
        System.out.println("Money:" + builder + " đ");

    }


}
