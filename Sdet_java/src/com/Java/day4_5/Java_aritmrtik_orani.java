package com.Java.day4_5;

public class Java_aritmrtik_orani {
    public static void main(String[] args) {
     int additionel, subtraction,division, multiplication,modulo;

     additionel=3+5; // toplama islemi icin
        subtraction= 5-3; // cikartma islemi icin
        division=4/2; //bolme islemi
        multiplication=3*5; //carpma islemi
        modulo=13%4; //birinci sayinin ikinci sayiya bolumunden kalan

        System.out.println("additionel="+ additionel);

        int num1=10,num2=3;
        int calculation= num1*num2+(num1%num2);

//ilk olarak parantes ici
        //ikinci olarakcarpma*, bolme/, ve mod alma (%)
        //son olarak lowest pencerede (+,-)
        System.out.println("calculation="+calculation);

        int sayi1=23, sayi2=5;
        int sonuc=(sayi1-sayi2)*sayi2+(sayi1+sayi2)%sayi2;

        int num_1 =3,num_2=7,num3=5;
        int result =num1+num2*num3;
        System.out.println("result="+result);




    }
}