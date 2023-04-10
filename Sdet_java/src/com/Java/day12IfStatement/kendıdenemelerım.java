package com.Java.day12IfStatement;

public class kendıdenemelerım {
    public static void main(String[] args) {

        int yas;
        yas=23;
        if (yas>18) System.out.println("oy kullana bilir");
        if(yas<18) System.out.println("oy kullanamaz");



        int vizeOrtalama=40;
        int finalOrtalamasi=60;
        double ortalama=(vizeOrtalama*0.40)+(finalOrtalamasi*0.60);
        if(ortalama>60) System.out.println( "TEBRIKLER sinavi gectniz");
        if(ortalama<60) System.out.println("butunleme");


        int dakika=400;
        int saat=dakika/60;
        if (saat>0 && saat<2) System.out.println("odemeniz gereken miktar 5€");
        if(saat>2 && saat<5) System.out.println("odemeni gereken miktar 10€");
        if(saat==5 && saat>5) System.out.println("odeme miktariniz 15€");




    }
}
