package com.Java.day27INPUT;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen bir sayinin rakamlarinin toplamini veren programi yaziniz.
        // Ornegin kullanici tarafindan girilen 1234 --> 1+2+3+4=10 gibi (Bunu derste cozduk)
        //Simdi;
        //Eger rakamlarin toplami 9 dan kucuk ise tekrar sayi istesin !!!!


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int rakam = 0;
        int rakamToplami = 0;
        while (sayi != 0) {
            rakam = sayi % 10;
            rakamToplami = rakam + rakamToplami;
            sayi /= 10;
        }
        System.out.println(rakamToplami);
        if (rakamToplami>9){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
        }else {
            System.out.println("basardiniz");
        }
    }
}