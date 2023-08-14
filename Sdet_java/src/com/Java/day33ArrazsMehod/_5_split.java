package com.Java.day33ArrazsMehod;

import java.util.Arrays;

public class _5_split {
    public static void main(String[] args) {
        String tex ="Bilmem ki anlatabilmek mi daha iyi yoksa aglatabilmek mi";
        String[] kelimeler=tex.split(" ");
//1.YONTEM
        System.out.println("Split sonrasi kelimelerin dizideki hali :"+ Arrays.toString(kelimeler));

//2.YONTEM
        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println(kelimeler[i]);

        }
 //3.YONTEM
        for (String s:kelimeler) {
            System.out.println("s:"+s);

        }
    }
}
