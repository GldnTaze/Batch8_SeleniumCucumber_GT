package com.Java.day31strıngMethod;

public class _3_contains {
    public static void main(String[] args) {
        String email="test@gmail.com";
        System.out.println(email.contains("@"));

        String list="patatoes, tomatoes, eggs, milk,bread,creal,meat,apples";
        if (list.contains("bread")){
            System.out.println("bread kelimesi mevcuttur");
        }else if (list.contains("cucumber")){
            System.out.println("cucumber kelimesi mevcuttur");
        }else {
            System.out.println("cucumber mevcut degildir");
        }
        email="test@yahoo.com";
        if (email.contains("@gmail")){
            System.out.println("kisinin gmail hesabi vardir");
        }else if (email.contains("@yahoo")){
            System.out.println("yahodan alinmistir");
        } else if (email.contains("@hotmail")) {
            System.out.println("hotmailden alinmistir");
        }
    }
}
