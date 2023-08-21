package com.Java.day36wrapperClasses;

public class _3_ {
    public static void main(String[] args) {
        boolean c=Character.isAlphabetic('a'); //alfabede yer alip almadigini boolean olarak doner
        System.out.println(c);

        System.out.println(Character.isAlphabetic('1'));
        Character.isAlphabetic('c');

        System.out.println("*****************");
        //bir test yazimindaki karakter olup olmadigini knt eder

        System.out.println(Character.isLetter('f'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetter('&'));
        System.out.println("---------------------------");
        //rakam mi
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('d'));
        char s=65;//A degerini verir
        System.out.println("s = " + s);


    }
}
