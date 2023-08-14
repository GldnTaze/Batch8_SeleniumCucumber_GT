package com.Java.day33ArrazsMehod;

import java.util.Arrays;

public class _2_ {
    public static void main(String[] args) {
      String[] names={"ayse","gulden","tazeoglu","suheda","bilal","ramazan","ali"};
        for (String s:names) {
            System.out.println("s = " + s);
        }
        System.out.println("toSitring ile yazdirma:"+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("siraladiktan sonra cikti:"+Arrays.toString(names));

        int[] dizi1={1,2,3};
        int[] dizi2={1,2,3};
        int[] dizi3={1,2,4};
        System.out.println("dizi1 ile dizi2 bir birine esit mi:"+Arrays.equals(dizi1,dizi2));
        System.out.println("dizi3 ile dizi2 bir birine esit mi:"+Arrays.equals(dizi3,dizi2));

        int[]sayilar=new int[5];
        Arrays.fill(sayilar,7);
        System.out.println("default degeri olan bes elementli int dizisine ayni degeri atadik:"+Arrays.toString(sayilar));


    }
}
