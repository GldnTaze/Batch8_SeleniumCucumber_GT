package com.Java.day31strıngMethod;

public class _2_stringContains {
    public static void main(String[] args) {
        //contains bir string teki karakterker olup olmadigini ccontrol etmeye yarar
        //boolean expression ile cvp dondurur true false return deger doner

        String str="merhaba";
        System.out.println(str.contains("a"));



        //boolean varmi=str.contains("a");
        System.out.println("varmi(f) = " + str.contains("f"));
        System.out.println("varmi(aba) = " + str.contains("aba"));
        System.out.println("varMi (a) = " +str.contains("a") );
        System.out.println("varmi (e,a) = " + (str.contains("a,e")));
        System.out.println("varmi(ea) = " +(str.contains("ea")));


    }
}
