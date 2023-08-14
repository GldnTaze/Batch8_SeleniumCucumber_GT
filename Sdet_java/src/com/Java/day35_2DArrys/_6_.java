package com.Java.day35_2DArrys;

import java.util.Arrays;

public class _6_ {
    public static void main(String[] args) {
        int[][] sayilar=new int[3][4]; //Zorunlu olan ve ilk kutu satirdir
        System.out.println(Arrays.deepToString(sayilar));
        int[] ciftSayilar={12,46};
        sayilar[1]=ciftSayilar;
        //sayilarin 1 satir index sine atatik
        System.out.println(Arrays.deepToString(sayilar));
        System.out.println("************");
        int[]asalSayilar=new int[7];
        asalSayilar[0]=13;
        asalSayilar[1]=2;
        asalSayilar[2]=3;
        asalSayilar[3]=53;
        asalSayilar[4]=73;
        asalSayilar[5]=33;
        asalSayilar[6]=31;

        sayilar[1]=asalSayilar;
        sayilar[2]=asalSayilar;

        System.out.println(Arrays.deepToString(sayilar));

        int[][] sayi={{1,3,},};
//        sayi[0][0]=1;
//        sayi[0][1]=3;

        System.out.println(Arrays.deepToString(sayi));


    }
}
