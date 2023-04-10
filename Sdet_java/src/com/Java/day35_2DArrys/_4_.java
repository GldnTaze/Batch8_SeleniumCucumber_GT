package com.Java.day35_2DArrys;

import java.util.Arrays;
import java.util.Random;

public class _4_ {
    public static void main(String[] args) {
        //4 ogrencinin 4 dersten aldigi puanlari gosteren int bir2D creat ediniz
        // 10 ile 100 arasinda degreler verin
        //tum derslerden aldigi puanlarin top hesaplayiniz

        int[][] puanlar=new int[4][4];
        for (int str = 0; str < puanlar.length ; str++) {
            for (int stn = 0; stn < puanlar[str].length; stn++) {
                Random rd=new Random();
                puanlar[str][stn]=rd.nextInt(100-10+1)+10;

            }
        }
        System.out.println("2D array yazdirma metodu ile cikti:"+ Arrays.deepToString(puanlar));


      //iki for ile yazdirma
        for (int satir = 0; satir < puanlar.length ; satir++) {
            for (int sutun = 0; sutun < puanlar[satir].length ; sutun++) {
                System.out.println(puanlar[satir][sutun]);

            }

        }
    }
}
