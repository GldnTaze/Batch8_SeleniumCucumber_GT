package com.Java.day31strıngMethod.ODEV;

import java.util.Scanner;

public class kelimeyiesitbolen {
    public static void main(String[] args) {
     //1.soru
     //Bir stringi iki esit parcaya bolen ve ilk yarisini yazdiran programi yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.print(" lutfen bir cumle girinız: ");
        String cumle = scanner.nextLine();

        int uzunluk = cumle.length();
        int ortaNokta = uzunluk / 2;

        String ilkYarisi = cumle.substring(0, ortaNokta);

        System.out.println("Cumlenin ilk yarisi: " + ilkYarisi);

    }
}
