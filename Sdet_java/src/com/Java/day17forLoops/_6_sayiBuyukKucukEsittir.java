package com.Java.day17forLoops;

public class _6_sayiBuyukKucukEsittir {
    public static void main(String[] args) {

        int num1=50;
        int num2=24;
        int repeat=4; //tekrar demek
        // sayinin buyuk mu kucuk mu veya esit mi durumlarini yazdiriniz

        for (int i=1;  i<= repeat; i++){
            if (num1>num2) {
                System.out.println("nun1 is greater than num2");
           }else if (num1<num2){
               System.out.println(" num2 is smaller than num1");
            } else if (num1==num2) {
                System.out.println("num1 is equel to num 2 ");

            }

        }

     for ( int i= 1; i<=repeat; i++) {
         System.out.println((num1>num2) ? "nun1 is greater than num2":(num1<num2)? " num2 is smaller than num1" :"num1 is equel to num 2 ");

     }


    }
}
