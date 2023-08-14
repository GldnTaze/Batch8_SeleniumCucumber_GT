package com.Java.day28;

import java.util.Random;
import java.util.Scanner;

public class _6_ornek {

    public static void main(String[] args) {

        // kullanici tarafindan belirlenen sinir ile rastgele sayi(int) uretilsin ve ayrica kullanicidan sayi tahmini
        //alinsin. Esit olmasi durumunda tebrikler yazdiriniz.


    Scanner sc=new Scanner(System.in);
    Random ra=new Random();

        System.out.println("rastgele sayilar icin sinir belirleyiniz");

        int sinirSayisi=sc.nextInt();
        int uretilenSayi=ra.nextInt(sinirSayisi);
        System.out.println("gelecek sayiyi tahmin ediniz");
        int tahminSayisi= sc.nextInt();
        if (uretilenSayi==tahminSayisi){
            System.out.println("bravo tebrikler");
        }else {
            System.out.println("bilemedi ki, bilemedi ki");
        }

  ////////////ternary ile yazilim
        String sonuc=(uretilenSayi==tahminSayisi) ? "bravo teprikler" : "bilemedi ki";
        System.out.println("sonuc:"+sonuc);

}
   }
