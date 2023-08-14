package com.Java.day27INPUT;

import java.util.Scanner;

public class odev {

    //  Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan ve x girildiğinde ise "Program bitti" yazan programı yazınız.

    public static void main(String[] args) {
        Scanner bitti = new Scanner(System.in);
        System.out.println("lutfen karakter giriniz");
        char karakter= bitti.next().charAt(0);
        while (karakter!='x'){
            System.out.println("program calisiyor");
            System.out.println("lutfen bir karakter giriniz");
             karakter= bitti.next().charAt(0);
        }if(karakter=='x'){
            System.out.println("program bitti");




        }
    }
}