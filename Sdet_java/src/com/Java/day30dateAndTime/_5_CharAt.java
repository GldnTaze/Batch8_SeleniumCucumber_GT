package com.Java.day30dateAndTime;

public class _5_CharAt {
    public static void main(String[] args) {
        // charat ile string icerisindeki char karakter leri alma

        String word="computer";
        System.out.println(word.length());

        char ilkKarakter=word.charAt(0); //ilk karakter 0 dir
                                         // charAt bir karakter aldigi icin char bir degisken tanimlamamiz gerekiyor
        System.out.println(ilkKarakter);

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));

    }
}
