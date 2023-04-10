package com.Java.day19haftasonuOdev;

public class sayiYildizSorusu {
    public static void main(String[] args) {

//        Beklenen Çıktı
//        5432*
//        543*1
//        54*21
//        5*321
//        *4321

//        for (int i=1; i<=3;i++){
//            for (int j=9; j<=1;j--){
//
//
//            }
//            System.out.println(i);
//        }


        int sayi1=1,sayi2=2,sayi3;
        System.out.print(sayi1 +" "+sayi2+" ");
        for (int i = 0; i <=15 ; i++) {
            sayi3 = sayi1 + sayi2;
            System.out.print(sayi3 + " ");
            sayi1 = sayi2;
            sayi2 = sayi3;
        }


    }
}
