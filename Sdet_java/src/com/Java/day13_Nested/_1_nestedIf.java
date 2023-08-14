package com.Java.day13_Nested;

public class _1_nestedIf {
    public static void main(String[] args) {

        //bir sayinin 100 den kucuk olma durumu bakiniz
        //ayrica ayni sayinin buyuk olma durumuna bakiniz
        //sayi hem 100 < hemde 50 den buyuk olma durumuna bakiniz
        //sayinin hem 50> hemde 100< olma durumana bakiniz


        int sayi=93;
        if (sayi<100){
            System.out.println("verilen sayi 100 den kiciktur");

            if (sayi>50) System.out.println("sayinin hem 100den kucuk hemde 50 den buyuk olma durumu");

        }

        if (sayi>50) {

            System.out.println("verilen sayi 50 den buyuktur");
            if (sayi<100)  System.out.println("verilen sayi hem 50den buyuk hem de 100 den kucuk");

        }





    }
}
