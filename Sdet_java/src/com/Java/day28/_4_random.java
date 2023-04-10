package com.Java.day28;

import java.util.Random;

public class _4_random {
    public static void main(String[] args) {
       // rast gele sayi demek
        
        Random r=new Random();
        int intRandom=r.nextInt();
        System.out.println("intRandom = " + intRandom);
        
        int sinirliRandom=r.nextInt(30); //30 dahil degil
        System.out.println("sinirliRandom = " + sinirliRandom);

        double randomDouble=Math.random()*10;
        System.out.println("randomDouble = " + randomDouble);
        int intRandomSayi=(int) randomDouble;
        System.out.println("intRandomSayi = " + intRandomSayi);


    }
}
