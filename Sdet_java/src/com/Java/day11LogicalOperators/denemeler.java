package com.Java.day11LogicalOperators;

public class denemeler {
    public static void main(String[] args) {



        //soru: 2 tane int degeri tanimal x ve y, xve y ye deger at
        // eger y >0 ise x degerini degidtir ve 1 ata x ve y nin degerini yazdirin


        int x=-20;
        int y=12;

        if(y>0) {
            x=1;
        }

        System.out.println("y="+y);
        System.out.println("x="+x);


        int num1=5;
        int num2=15;

        System.out.println(num1< 6 && num2> 12);

        if(num1< 6 && num2> 12) {

            System.out.println("num1 < 6");


            int sayi = 15;
            if (sayi % 2 == 1) {

                System.out.println("bu sayi tek bir sayidir");

            }

            if (sayi % 2 == 0) {

                System.out.println("bu sayi cift bir sayidir");
            }

        }


        // kalan dakikalarin saniye cinsinden dogru sonuc verdigini test ediniz


        int dakika =11;
        int saniye=60;
         int toplamSaniye= dakika*saniye;

         if(!(toplamSaniye== 660)){
             System.out.println("toplamSaniye="+toplamSaniye);
         }








    }
}
