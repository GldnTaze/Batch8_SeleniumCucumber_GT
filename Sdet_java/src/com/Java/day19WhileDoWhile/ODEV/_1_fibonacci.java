package com.Java.day19WhileDoWhile.ODEV;

public class _1_fibonacci {
    public static void main(String[] args) {

        // 15 adet fibonacci sayinin yazdiralim


        int sayi=15;
        int oncekiSayi= 0;
        int sonrakiSayi=1;

        for (int i=1; i<=sayi; i++){

            System.out.print(oncekiSayi + " ");
            int top=oncekiSayi+sonrakiSayi;
            oncekiSayi=sonrakiSayi;
            sonrakiSayi=top;
        }
    }
}
