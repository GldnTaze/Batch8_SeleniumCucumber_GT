package com.Java.day31strıngMethod;

public class _7_substring {
    public static void main(String[] args) {
        String str="java string manipulation is fun";
        str=str.substring(5);
        System.out.println("str = " + str);
        
        str=str.substring(20);
        System.out.println("str = " + str);
        
        str=str.substring(0,2);
        System.out.println("str = " + str);

        String strıng="merhaba dunya";
        System.out.println(strıng.substring(2,5)); // baslangic degeri dahil son deger dahil degil
    }
}
