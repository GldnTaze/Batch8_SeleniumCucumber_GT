package com.Java.day21returnMetod;

public class _5_amazon {
    public static void main(String[] args) {
        amazonHomePage();

    }
    public static void amazonAramaMotoru(){
        System.out.println("amazon sayfasinda ayakkabilari arat ");
    }
    public static void amazonAyakkabilariFilitrele(){
        System.out.println("spor ayakkabilari filitleyerek göster");
    }
    public static void amazonHomePage(){
        System.out.println("amazonun ana sayfasina gittik");
        System.out.println("*****************************");
        amazonAramaMotoru();
        amazonAyakkabilariFilitrele();
    }
}
