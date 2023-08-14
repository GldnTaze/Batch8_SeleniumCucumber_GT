package com.Java.day33ArrazsMehod;

import java.util.Arrays;

public class _3_ornek {
    public static void main(String[] args) {
        String abc="aabbcaabbccddeaatdfdxc";
        char[] karakterler =new char[args.length];

        int[] arr1={2,4,6,8,10};
        int[] arr2=arr1;
        System.out.println("direkt olarak esitledigim dizi :"+Arrays.toString(arr2));

        arr1[0]=20;
        arr2[4]=100;   //5.elemente yeni deger atatim
        System.out.println("arr1 dizisinin element degerleri : "+Arrays.toString(arr1));
        System.out.println("arr2 dizisinin element degerleri : "+Arrays.toString(arr2));
    }
}
