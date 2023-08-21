package com.Java.day20;

public class _5_ {
    public static void main(String[] args) {
//        1 1
//        1 2
//        1 3
//        2 1
//        3 1
//        3 2
//        3 3

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=3 ; j++) {
                if(i==2 && j>=2)
                    continue;
                System.out.println(i+" "+j);

            }
            
        }
    }
}
