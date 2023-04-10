package com.Java.day25objectAndClass;

public class _1_ {
    public static void main(String[] args) {


    }
}

class Araba{
    String model;
    int yili;
    String rengi;
    double kilometre;
    String yakitTuru;

//    public void yazdir(){
//
//        String info="Arabanin modeli [ "+model+"], Arabanin yili [ "+yili+" ], Arabanin rengi [ "+rengi+
//                "], Arabanin kilometresi ["+kilometre+" ], Arabanin Yakit turu [ "+yakitTuru +"]";
//
//        System.out.println("info = " + info);

 //   }


}
    class _2_objeCreatEtmekARABA {
    public static void main(String[] args) {
        Araba bilalinArabası;
        bilalinArabası = new Araba();

        // bilalinArabası=new Araba();   =>ikinci yazilma yontemi

        bilalinArabası.yakitTuru = "Deisel";
        bilalinArabası.rengi = "yesil";
        bilalinArabası.kilometre = 12000.51;
        bilalinArabası.yili = 2020;
        bilalinArabası.model = "BMW";
        System.out.println("arabanin yakit turu:" + bilalinArabası.yakitTuru);
        System.out.println("arabanin rengi:" + bilalinArabası.rengi);
        System.out.println("arabanin kilometresi:" + bilalinArabası.kilometre);
        System.out.println("arabanin yili:" + bilalinArabası.yili);
        System.out.println("arabanin modeli:" + bilalinArabası.model);

    }
}
