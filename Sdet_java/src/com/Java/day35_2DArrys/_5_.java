package com.Java.day35_2DArrys;

import java.util.Arrays;

public class _5_ {
    public static void main(String[] args) {
       int[][]number=new int[3][3];

        for (int r = 0; r < number.length; r++) {//satir forunu yazdiginizda satir uzunlugunu alacagiz

            for (int c = 0; c < number[r].length; c++) {
                int indexValue=number[r][c]=r+c;
                System.out.println(indexValue);
            }
        }

        System.out.println(Arrays.deepToString(number));

    }
}
