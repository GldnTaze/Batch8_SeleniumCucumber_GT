package com.Java.day13_Nested;

public class _5_ifelse {
    public static void main(String[] args) {

        int yas =25;
        int sayi=35;

        if (sayi<100){
            System.out.println("gecerli sayidir");
            if (sayi>45){
                System.out.println("ozel sayilar");
            }else
                if(sayi==35){
                    System.out.println("omrunun yarisini ifade eden sayi");
                }



        } else System.out.println("gecersiz sayi");
    }
}
