package com.Java.day12IfStatement;

public class ortalamasorulari {
    public static void main(String[] args) {


        int vizeNotu=30;
        int finalNotu=70;
        double avarege=(vizeNotu*0.40) + (finalNotu*0.60);
        if(avarege>=60){
            System.out.println("matematik dersini gectiniz");
        }

        else {
            System.out.println("matematik dersinden kaldiniz");
        }

        //bir sayinin pozitif negatif oldugunu bulalim + - 0 uc durumdda olabilir

        int num=10;
        if(num>0) System.out.println(num+"bu sayi pozitifitr");
        if(num<0) System.out.println(num+"bu sayi negatiftir");

        if (num==0) System.out.println(num+"bu sayi sifirdir");


        double warteZeit=100; //beklenen sure
        double hour =warteZeit/60;
        if (hour>0 && hour<2) System.out.println("odemeniz gereken miktar 5$");
        if (hour>=2 && hour<5) System.out.println("odemeniz gereken miktar10$");
        if (hour>=5) System.out.println("ödemeniz gereken miktar 15$");

    }
}
