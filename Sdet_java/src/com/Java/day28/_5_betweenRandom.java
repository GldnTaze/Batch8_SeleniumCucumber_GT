package com.Java.day28;

import java.util.Random;

public class _5_betweenRandom {
    public static void main(String[] args) {
        //boundary
        Random random = new Random();
        int sayi = random.nextInt(6);
        int sayi2=random.nextInt(50);

        //Between aralikli deger atama
        int max=12;
        int min =5;
        int araliklidegeralma=(int)(Math.random()*(max-min)+1);
        System.out.println("araliklidegeralma:"+araliklidegeralma);

        //math olmadan yazilma sekli
        int rastgele;
        rastgele=random.nextInt((12-5)+5);
        System.out.println("rastgele:"+rastgele);
        ////////////////////////////////////////
        int betweendeger=random.nextInt((99-30)+1)+30;
        System.out.println("betweenDEger:"+betweendeger);

        ////////////////////////////////////////
        boolean booleanRandom= random.nextBoolean();
        System.out.println("booleandeger:"+booleanRandom);




        //boolean rastgelen deger atama
    }
}
