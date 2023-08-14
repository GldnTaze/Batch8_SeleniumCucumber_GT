package com.Java.day22;

public class _7_yasCalculator {
    public static void main(String[] args) {
        //currentYear --> mevcut yil
        //birtYear --> dogum yili
        //Methodname=ageCalculator
        //What age?
        yasHesaplama(1985,2023);
    }
    public static void yasHesaplama( int dogumYili, int yasamYili){
        int yas=dogumYili-yasamYili;
        System.out.println(yas);
    }
}
