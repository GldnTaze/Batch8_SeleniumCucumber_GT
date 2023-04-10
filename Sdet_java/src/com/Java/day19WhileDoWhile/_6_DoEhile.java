package com.Java.day19WhileDoWhile;

public class _6_DoEhile {
    public static void main(String[] args) {

        int i=10;
        // ilk BASLANGIC asamasinda SART kontrol edilmez. Sonrasinda sarti sagladigi surece dongu doner.
        do {
            System.out.println("i = " + i);
            //Beklenen cikti --> 10, 9,8,7,6,5,4,3,2
            i--; //

        }while (i>1);



    }
}
