package com.Java.day28;

import java.util.Scanner;

public class _1_stringNext {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sitring giriniz");
        String kelime=scanner.next();
        //Her kelime icin bir next gereklidir.
        System.out.println("kelime = " + kelime);

        Scanner scanner1=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
         String cumle=scanner1.nextLine();
        System.out.println("cumle:"+cumle);
    }
}
