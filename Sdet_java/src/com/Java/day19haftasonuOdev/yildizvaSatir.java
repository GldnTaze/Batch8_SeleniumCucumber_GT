package com.Java.day19haftasonuOdev;

public class yildizvaSatir {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız
        //     *  -> 1.Satırda 4 bosluk 1 yıldız
        //    **  -> 2.Satırda 3 boşluk 2 yıldız
        //   ***  -> 3.Satırda 2 boşluk 3 yıldız
        //  ****  -> 4.Satırda 1 boşluk 4 yıldız
        // *****  -> 5.Satırda 0 boşluk 5 yıldız.

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*" );


                }

            System.out.println( );
            }


        }
    }



