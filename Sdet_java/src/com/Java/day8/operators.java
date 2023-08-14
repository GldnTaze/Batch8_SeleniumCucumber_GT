package com.Java.day8;

public class operators {
    public static void main(String[] args) {
//
////        int sayi =12;
////        int rakam =132;
////        System.out.println("rakam = " + rakam);
////
////        rakam++; //burada ayni degiskene esittir operatoru ile farkli bir de
//
//
//        int rakam=2; //degeri bir artirmak istiyorum
//        rakam=rakam+1;
//      //  System.out.println("rakam+1 = " + (rakam+1));
//        System.out.println("rakam++ = " +rakam++ );
//
//        //rakam++;
//        System.out.println("rakam="+rakam);
//
//        int sayi=1;
//        System.out.println("sayi="+sayi++);   //postfix
//        System.out.println("sayi="+ ++sayi);  //prefix
//
//        int sayac=5;
//        sayac++;
//        sayac=sayac+1;    //bu iki sekilde sayac bir artirila bilir.
//
//       // NEGATIV olarak
//
//        sayac--;
//        sayac=sayac-1;   //sayac degerini bir azaltir.
//
//        //önemli: sayini ne zaman bu artitimi grtcrklestirdigi cok onemlidir.
//        // cunku sayi oncesinde mi veya bu UNARY arttirma ve azaltma yaptirilir
//
//
//        ++sayac;
//        --sayac;

        //AssigneOperators:

        int sayac=0;
        sayac++; // sayac-> 1oldu
        sayac--; // tekrar -> 0 oldu

        sayac=sayac+4;
        System.out.println("sayac = " + sayac); //->4 ekledi


        sayac+=4; // sayac 8
        System.out.println("sayac = " + sayac);


        sayac-=4; //sonuc 4
        System.out.println("sayac = " + sayac);


        int valt=42;
        --valt;
        System.out.println("--valt = " + --valt); //consol40
        System.out.println("valt-- = " + valt--); // 40

        valt+=5;  //volt44
        System.out.println("++valt = " + ++ valt);  //45
        
        
        int rakam=21;
        System.out.println(rakam+5);
       // System.out.println("rakam = " + rakam+5); ->5 string ifade olarak görürür.







    }
}
