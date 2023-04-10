package com.Java.day17forLoops;

public class _3_ciftTekSayilar {
    public static void main(String[] args) {
        // cift olan sayilarin yazdirilmasi
        //1 den 100 e kadar

        for (int i= 1; i<=100; i++){
            if (i%2==0){    // dongudeki sayinin cift olma durumunu knt rdiyoruz
                //System.out.println("i="+i);
                System.out.print(i+" "); // burada yan yana yazdirma sekli
            }
        }

        // 5 ten 240 a kadar olan tek sayilari yazdiriniz

        for (int i=5 ; i<=140; i++) {
            if (i % 2 != 0) {       //yada (i%2==1
                System.out.println("i=" + i);  ///--> ln sildigimiz zaman yan yana yazar
            }


        }
    }
}
