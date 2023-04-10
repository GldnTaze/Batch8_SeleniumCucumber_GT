package com.Java.day8;

public class Assigments {
    public static void main(String[] args) {

        //string name; decleration icin MUST -> variable veya degisken tipi ve variable veya degisken ismi
        //String camelCase; // For valid-> data Name


        //DECLERATTION
        String lastName;

        double taxRate;
        int age;
        boolean marriedOrNo;

        //ASSIGEMENT   -> islem bitiminden once belirnenen ayni degiskine tek bir deger atana bilir.



        int num1=3+5;  // ASSIGNE(atama) isleminde operator kullanila bilir. ASSIGNE operatorile kisaltma yapailir
        System.out.println("num1 = " + num1); //8

        int num2=1+1+1+1+1-5+2;
        System.out.println("num2 = " + num2); //2

        num1-=3;
        System.out.println("num1 = " + num1); //5


        num2+=4;
        System.out.println("num2 = " + num2);  // 6




         num1*=3;
        System.out.println("num1="+num1);  //15

        int toplam=num1+num2;
        System.out.println("toplam="+toplam);   // 21

        toplam-=num1;
        System.out.println("toplam="+toplam); // 6




    }
}
