package com.Java.day19WhileDoWhile.ODEV;

public class _2_pramitUcgen {
    public static void main(String[] args) {
//
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//    * * * * * *
//   * * * * * * *
//  * * * * * * * *
// * * * * * * * * *

        for ( int i=1;i<=9;i++){
            for (int j=9; j>i;j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*" +" ");
            }
            System.out.println( );
        }
    }
}
