package com.Java.day16ternaryOperatirs;

public class _10_ {
    public static void main(String[] args) {
        // ogrenci ismi Ahmet ve yasi 20 den kucukse ekrana kayit oldu kayit olmadi


        String name="Ahmet";
        int age =22;
        String sonuc =" ";

        sonuc=(name=="Ahmet" && age<20)? "kayit oldu":"kayit redddetildi.";
        System.out.println(sonuc);
        System.out.println((name=="Ahmet" && age<20)? "kayit oldu":"kayit redddetildi.");


        if (name=="Ahmet" ){
            if (age<20) {
                sonuc = "kayit oldu";
            }else {
                System.out.println("yas 20 den kucuk olmali");
            }
            }else {
            System.out.println("isim Ahmet degildir");
        }

            System.out.println(sonuc);




    }
}
