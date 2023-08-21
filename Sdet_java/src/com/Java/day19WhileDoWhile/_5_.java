package com.Java.day19WhileDoWhile;

public class _5_ {
    public static void main(String[] args) {

//
//        char harf=65;  //char degerini bir bir attirarak kucuk a harfini bulana kadar donguyle karakterleri yazdiriniz
//        //kucuk a 97
//
//        while (harf<=97){
//            System.out.println("harf="+harf);
//            harf++;
//        }


        //EGER BILMIYORSAK
        char harf = 0;
        while (harf <= 'a') {
            System.out.println("harf=" + harf);
            harf++;
        }


        for (
                int i = 1; 1 <= 255; i++) {
            char character = (char) i;
            System.out.println(i + "=" + character);
        }

    }
}