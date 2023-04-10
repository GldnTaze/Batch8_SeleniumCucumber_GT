package com.Java.day19haftasonuOdev;

public class abcharfler {
    public static void main(String[] args) {

//
//        Beklenen çıktı
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//
    for ( int i=0; i<=4; i++){

        for (int j =0; j<=i; j++){
            char harf=(char) ('A'+j);
            System.out.print(harf);
        }
        System.out.println();
    }



    }
}







