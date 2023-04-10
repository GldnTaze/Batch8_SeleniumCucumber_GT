package com.Java.day21returnMetod;

public class _4_ {

    public static void metod1(){
        System.out.println("metod1 kodu calistirildi");
        System.out.println("metod1 in 2inci kodu calisti");
    }


    public static void main(String[] args) {
        metodlar();

    }
    public static void metod2(){
        System.out.println("metod2 kodu calistirildi");
        System.out.println("metod2 in ikinci kodu calisti");
    }
    public static void metodlar(){
        System.out.println("metodlar adi kodu calistirdik");
        System.out.println("-----------------------------");
        metod1();
        metod2();
    }
}
