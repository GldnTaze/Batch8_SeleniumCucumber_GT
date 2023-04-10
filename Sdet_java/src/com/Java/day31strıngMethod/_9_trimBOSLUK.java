package com.Java.day31strıngMethod;

public class _9_trimBOSLUK {
    public static void main(String[] args) {
        String str="Merhaba Dunya";
        
        boolean b=str.isEmpty();   //methodun bos olup olmadigini knt eder
        System.out.println("b = " + b);

        boolean b1=str.startsWith("Me");  //bi harfle basladigini knt eder boolean doner
        System.out.println("b1:"+b1);
        
        boolean b3=str.endsWith("ya");    //bu harfle bitiyor mu
        System.out.println("b3 = " + b3);
        
        boolean b2=str.equalsIgnoreCase("MERHaba DunYA");
        System.out.println("b2 = " + b2);
        
        String str1="       Geliyor Yeni SDET ler        ";      //bas ve son bosluklari siler
        System.out.println("str1 = " + str1);
        str1=str1.trim();
        System.out.println("str1 = " + str1);
    }
}
