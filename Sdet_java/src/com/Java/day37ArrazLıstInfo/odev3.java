package com.Java.day37ArrazLıstInfo;

import java.util.Scanner;

public class odev3 {

    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin sadece tek elemanlarını ayrı diziye bir metodda atayarak main de yazdırınız.


        int[] dizi = new int[6];
        int[] tekler = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("6 adet sayı giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scanner.nextInt();
        }

        int tekSayilarinSayisi = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) {
                tekler[tekSayilarinSayisi] = dizi[i];
                tekSayilarinSayisi++;
            }
        }

        System.out.println("Girilen tek sayılar: ");
        for (int i = 0; i < tekSayilarinSayisi; i++) {
            System.out.print(tekler[i] + " ");

        }

    }
}
