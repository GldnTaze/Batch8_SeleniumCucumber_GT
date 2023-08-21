package com.Java.day22;

public class _4_localMetod {
    public static void main(String[] args) {
        deerPlay(60,true);


    }


    public static void deerPlay (double temp, boolean isSummer){
        if (isSummer){
            if ( temp>60 && temp<100){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            if (temp>60 && temp<90){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
