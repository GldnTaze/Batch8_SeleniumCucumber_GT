package com.Java.day18nestedForloops;

public class _6_ {
    public static void main(String[] args) {

//#
//  #
//   #
//    #
//     #
//      #
//       #

        for( int i=1; i<=7; i++) {  //satir sayisina gore dongu olusturduk
            for (int j = 1; j < i; j++) {  //bosluklari yan yana yazdirdik
                System.out.print(" ");
            }
            System.out.println("#"); //Burada print LN ile yazdirdik. Her seferinde satir atlasin
        }
    }
}
