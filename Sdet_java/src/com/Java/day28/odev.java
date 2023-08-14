package com.Java.day28;

import java.util.Random;

public class odev {
    public static void main(String[] args) {
      //  50 ile 99 sayilari arasinda (99 DAHIL) rastgele bir TEK sayi Degeri veren ciktisini veren programi method ile yaziniz


        Random sc=new Random();

       rastgele();
    }
    public static int rastgele (){

        int min=50;
        int max=99;
        int num=(int)(Math.random()*(max-min)+1);
        while (num%2==1){
            System.out.println("random nummer:"+num);
            break;
        }

        return num;


    }
}
