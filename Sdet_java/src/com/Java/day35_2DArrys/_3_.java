package com.Java.day35_2DArrys;

import java.util.Arrays;

public class _3_ {
    public static void main(String[] args) {
        String [] kelimeler ={"bilal","ahmet","mehmet"};
        int[]sayilar={1,3,8,5,3};
        //FOR ILE yazdirma
        for (int i = 0; i <kelimeler.length ; i++) {
            System.out.println(kelimeler[i] + " ");
        }
        System.out.println("------------------------");
            //Foreach
            for (String s:kelimeler) {
                System.out.println(s);

            }
            System.out.println("***********************");
            //Array icerisinde toString
            System.out.println(Arrays.toString(kelimeler));

        int [][] tablo1={{1,2,3},{4,5,3},{2,7,9}};

        int[][]tablo=new int[3][3];
        tablo[0][0]=4;
        System.out.println("tablo[0][0] = " + tablo[0][0]);

//Satir degistiriyor
        for (int satir = 0; satir < tablo1.length; satir++) {
            //Satirin stun degerlerini yazdiriyor
            for (int sutun = 0; sutun < tablo1[satir].length; sutun++) {
                System.out.println(satir + "`inci satirin " + sutun + " `inci stun degeri :" + tablo1[satir][sutun]);
            }
        }
        String tax[][]=new String[5][5];

        int[] sayi={1,6,9,10,34};
        System.out.println(sayi.length);
        int[][] sayilar1={{1,2,4},{5,7,9},{12,45,23}};
        System.out.println("sayilar1.length = " + sayilar1.length);

        //Bu elemanlarin icerisindeki degerleri yani stunlarin uzunlugunu nasil buluruz
        //Sifirinci index de yer alan elemnanin UZUNLUGU  YANI -->STUN SAYISI
        System.out.println("sayilar1[0].length = " + sayilar1[0].length);

    }
    }

