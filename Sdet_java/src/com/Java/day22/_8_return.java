package com.Java.day22;

public class _8_return {
    public static void main(String[] args) {
       // System.out.println(toplam(11,20));

        int total=toplam(11,20);
        System.out.println("total="+total);
    }
    public static int toplam(int x, int y){
       int result=x+y;

        return result;
    }
}
