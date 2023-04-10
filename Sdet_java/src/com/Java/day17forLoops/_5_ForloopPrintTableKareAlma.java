package com.Java.day17forLoops;

public class _5_ForloopPrintTableKareAlma {
    public static void main(String[] args) {
        //number  numberSquared
        //1 den    1 kadar
        //2        4
        //3        9
        // 1 den 10 kadar yazdiriniz

        System.out.println(" Number    NumberSquared"); //listenin ust tarafinda adini adlandirdik
        System.out.println("------     ------------");

        for (int num=1; num<=10;  num++){

            System.out.println( num + "\t\t\t\t"+ num*num);

            //burada sayinin kendisi ve arada bosluk olusturup sonrasinda sayinin karesini yazdirdik
        }


    }
}
