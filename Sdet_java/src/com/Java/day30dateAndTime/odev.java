package com.Java.day30dateAndTime;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ad ve soyadinizi giriniz");
        String name=input.nextLine();
        name=name.toUpperCase();
        char ilkHarf=name.charAt(0);
        int nameUzunlugu=name.length();
        char soyadiIlkHarf=' ';
        int i=0;

        for (i=0;  i<nameUzunlugu; i++) {
            if (name.charAt(i)== ' '){
              soyadiIlkHarf=name.charAt(i+1);
            }

        }
        System.out.println(ilkHarf +"."  +" "+ soyadiIlkHarf+".");

    }
}
