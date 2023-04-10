package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;
import java.util.Collections;

public class _2_ {
    public static void main(String[] args) {
        //ArrayList bir collection grubunun bur elemani
        // sort ile siralama yapiliyor

        //int array
        ArrayList<Integer> rakamlar =new ArrayList<>()  //iki suslu parantezle ekleme
        {
            {
              add(3);
              add(12);
              add(1);
              add(24);
            }

        };
        rakamlar.add(9);
        System.out.println(rakamlar);

        //sort siralama
        Collections.sort(rakamlar);
        System.out.println("sort sonrasi:"+rakamlar);

        //tersine vecirme
        Collections.reverse(rakamlar);
        System.out.println("listenin tersi:"+rakamlar);

        //tum elemanlarina tek bir atama
        Collections.fill(rakamlar,8);
        System.out.println("tum elemanlara ayni deger atanmasi:"+rakamlar);

        // listedeki elemanin degerii degistirme
        Collections.replaceAll(rakamlar,8,9);
        System.out.println("yeniden degistirme:"+rakamlar);
    }
}
