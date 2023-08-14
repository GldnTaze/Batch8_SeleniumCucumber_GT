package com.Java.day17forLoops;

public class _8_rulesKurallar {
    public static void main(String[] args) {
//        //  1- bir infinitive for dongusu olusturmak
//        // hic bir sart ve tanimlama olmazsa kod calisir ve sonsuz donguye girer
//        for ( ; ; )       //; den once tanimlama kismi ifade eder zorunlu degil.dongunun disinda tanimlanir
//                         //iki ; yazilmali iki ; dongunun sarti yazilir
//                         // iki ; sonra artis yada azalis degeri
//        {
//            System.out.println("merhaba");  //for un kod blogunu tanimlar
//        }
//
//        int i=1;   // degisken tanimlamayi for disinda diger kisimlari icinde yazdik
//        for (; i<=10; i+=2){
//            System.out.println("i="+ i);
//        }
//        for ( ; ; i++) {   // dongu sarti yok sonsuz dongu
//            System.out.println(i);
//        }
//
         int i=1;
         for ( ; i<=15;){
             System.out.println("i ="+i); // artis azalis yok sonsuz donguye girer
         }
    }
}
