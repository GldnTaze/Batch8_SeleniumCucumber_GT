package com.Java.day27INPUT;

import java.util.Scanner;

public class _4_alanHesabi {
    public static void main(String[] args) {
        //bir dairenin alanini hesaplayan metod yaziniz.scanner ile kullanicidan aliniz
        Scanner sc=new Scanner(System.in);
        System.out.print("hayrina bir yaricap degeri giriniz : ");
        double yaricap=sc.nextDouble();

        System.out.println("Dairein Alani : "+daireninAlani(yaricap));


    }

    public static double daireninAlani(double yaricap){
        double pi=3.14;
        double alan=pi*yaricap*yaricap;

        return alan;


    }

}
