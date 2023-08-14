package com.Java.day37ArrazLıstInfo;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {

        // Kullanıcıda alacağını bir cümleyi kelimelerine göre tersten yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle girin: ");
        String cumle = scanner.nextLine();

        String tersCumle = "";

        for (int i = cumle.length() - 1; i >= 0; i--) {
                tersCumle += cumle.charAt(i);
            }
        System.out.println(tersCumle);

        }
    }


