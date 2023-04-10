package com.Java.day30dateAndTime;

public class _4_lenght {
    public static void main(String[] args) {
        String str="java";
        String tex="euroTechStudy";

        int x1=str.length();  //karakter sayisini verir.
        System.out.println("x1 = " + x1);

        // lenght()uzunlugu hesaplar
        System.out.println("tex = " + tex.length()*10);

        String name=new String("gulden");
        int strUzunluk=name.length();
        System.out.println("new ile olusturulan nesnenin uzunlugu:"+strUzunluk);



    }
}
