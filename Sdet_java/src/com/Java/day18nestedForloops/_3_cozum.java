package com.Java.day18nestedForloops;

public class _3_cozum {
    public static void main(String[] args) {
        for (int i=0; i<3;i++) { // i sifirdan baslayarak 3 kadar 3 kez donecek

            System.out.println("Outer Loop at state: " + i);

            for (int j=0;j<4;j++){ // j 0 dan baslayarak 4 kadar dort kez donecek

                System.out.println("Inner Loop at state: "+ j);
            }
            System.out.println();

        }


    }
}
