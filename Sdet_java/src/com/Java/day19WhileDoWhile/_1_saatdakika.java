package com.Java.day19WhileDoWhile;

public class _1_saatdakika {
    public static void main(String[] args) {
        // saat dk saniye dagilimi donderen dongu  saat: dakika: saniye, 01:59:59

        for (int saat=0; saat<=12; saat++){

            for ( int dakika=0; dakika<60; dakika++){


               // System.out.println("dakika="+dakika);

                for ( int saniye=0; saniye<=59; saniye++){
                    System.out.printf("%02d: %02d:%02d\n" , saat,dakika,saniye);  //F ile saat dogusunun yan yana yazilmasini sagladim


                }
            }
            System.out.println();
        }



    }
}
