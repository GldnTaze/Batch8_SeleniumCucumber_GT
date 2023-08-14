package com.Java.day31strıngMethod;

public class _8_lowerUpperCase {
    public static void main(String[] args) {
        String chars="{{}}";
        String word="AutoMation";
        
        String redult=chars.substring(0,2).concat(word).concat(chars.substring(2));
        System.out.println("redult = " + redult);
        String result2=chars.substring(0,2)+word+chars.substring(2);

        //toLowerCase-->Bir string icerisindeki buyuk karakterleri kucuk karakter haline cevirir
        //toUpperCase-->Bir string icerisindeki kucuk karakterleri buyuk karakter haline cevirir

        word=word.toLowerCase();
        System.out.println("word = " + word);

        System.out.println("word:"+word.toUpperCase());
        
    }
}
