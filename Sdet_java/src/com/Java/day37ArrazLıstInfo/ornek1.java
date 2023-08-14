package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;
import java.util.Arrays;

public class ornek1 {
    public static void main(String[] args) {
        // Bir sabit dizi yazınız, ardından bu diziyi ArrayList e ekleyiniz.
        // Sonrasında 4 eleman daha ekleyip, önceki elementleri bir döngü ile siliniz

        String[] dizi = {"elma", "armut", "çilek", "portakal"};



        ArrayList<String> liste = new ArrayList<>(Arrays.asList(dizi));

        // 4 eleman daha ekle
        liste.add("karpuz");
        liste.add("üzüm");
        liste.add("kiraz");
        liste.add("erik");
        System.out.println("4 eleman daha ekledik:"+liste);


        int boyut = liste.size();
        for (int i = 0; i < boyut-4; i++) {
            liste.remove(0);
        }


        System.out.println("Yeni Liste: "+ liste);

    }
}
