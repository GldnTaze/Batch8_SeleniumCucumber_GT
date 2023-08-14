package com.Java.day13_Nested;

public class _7_soruCozumleri {
    public static void main(String[] args) {

        //int28

        int num = 28;
        int birlerBasamagi = num % 10;
        int onlarBasamagi = num / 10;
        if (onlarBasamagi == 1) System.out.print("on ");
        if (onlarBasamagi == 2) System.out.print("Yirmi ");
        if (onlarBasamagi == 3) System.out.print("Otuz ");
        if (onlarBasamagi == 4) System.out.print("Kirk ");
        if (onlarBasamagi == 5) System.out.print("Elli ");
        if (onlarBasamagi == 6) System.out.print("Altmis ");
        if (onlarBasamagi == 7) System.out.print("Yetmis ");
        if (onlarBasamagi == 8) System.out.print("Seksen ");
        if (onlarBasamagi == 9) System.out.print("doksan ");

        if (birlerBasamagi == 1) {System.out.println("bir");}
        else if (birlerBasamagi == 2) {System.out.println("iki");}
        else if (birlerBasamagi == 3) {System.out.println("uc");}
        else if (birlerBasamagi == 4) {System.out.println("dort");}
        else if (birlerBasamagi==5){System.out.println("bes");}
        else if  (birlerBasamagi==6){System.out.println("Alti");}
        else if (birlerBasamagi==7){System.out.println("Yedi");}
       else if (birlerBasamagi==8){System.out.println("Sekiz");}
        else if (birlerBasamagi==9){System.out.println("dokuz");}




    }
}
