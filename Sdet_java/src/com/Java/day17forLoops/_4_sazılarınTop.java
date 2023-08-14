package com.Java.day17forLoops;

public class _4_sazılarınTop {
    public static void main(String[] args) {
        // 1 den 100 e kadar olan cift ve tek sayilari ayri ayri top yaziniz

        int oddTotal = 0;
        int evenTotal = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenTotal =evenTotal+ i;


            } else {
                oddTotal += i;

            }

        }
        System.out.println("evenTotal=" + evenTotal);
        System.out.println("oddTotal=" + oddTotal);
    }
}


