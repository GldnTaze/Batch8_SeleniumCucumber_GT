package com.Java.day16ternaryOperatirs;

public class _4_ {
    public static void main(String[] args) {
        int x = 4;
        if (x>2){
            if (x<5){
                x=10;
                System.out.println("x="+x);
            }else
            {
                x = 7;
                System.out.println("x=" + x);
               }
           } else
              {
                   x = 5;
                    System.out.println("x = " + x);
               }

        System.out.println(x > 2 ? (x < 5 ? 10 : 7) : 5);
        // ternary operatorde sirayla okudugu icin parantez olmasada
    }
}
