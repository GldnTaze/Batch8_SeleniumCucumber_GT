package com.Java.day31strıngMethod;

public class _5_replace {
    public static void main(String[] args) {
        //replace yeniden yazma hakki taniyor
        
        String str="londan is capital of germany";
        System.out.println("str = " + str);
        str=str.replace("londan", "berlin");
        System.out.println("str = " + str);

        str=str.replace("berlin","wien").replace("germany","austria");
        System.out.println("str = " + str);
        
        str=str.replace("wien","").replace("is","");
        System.out.println("str = " + str);

        //Bir string te gecen tum ayni karakterleri degistirmek icin
        String string1="MerHabaMerhaBa";
        string1=string1.replaceAll("[A-Z]","_");
        System.out.println("string1 = " + string1);

    }
}
