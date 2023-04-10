package com.Java.day12IfStatement;

public class sayinitersyazimi {
    public static void main(String[] args) {
        int sayi=123;

        int biler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        System.out.println("yerdegistirme="+biler+onlar+yuzler);
    }
}
