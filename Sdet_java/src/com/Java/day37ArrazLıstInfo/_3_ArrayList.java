package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_ArrayList {
    public static void main(String[] args) {
        //deger atama
        ArrayList<Integer>sayilar=new ArrayList<>(Arrays.asList(15,4,6,11,44,87));
        //belirli olan diziyi ArrayList atadik
        System.out.println("dizinin eleman sayisi:"+sayilar.size());

         sayilar.add(32);
         sayilar.add(sayilar.size());
        System.out.println("yeni eklemeler sonrasi:"+sayilar);
    }
}
