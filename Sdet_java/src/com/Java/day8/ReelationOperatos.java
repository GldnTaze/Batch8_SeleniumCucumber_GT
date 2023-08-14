package com.Java.day8;

public class ReelationOperatos {
    public static void main(String[] args) {


        //bir sayi 6 farkli REELATIONOPERATOS ile test edile bilir. Cevaplari boolean doner.(TRUE veya FALSE


        // ==  ESIT mi
        // !=  ESIT degil mi
        // >   onceki sayi sonrakinden buyuk mu
        // <   onceki sayi sonrkinden kucuk mu
        // >=  iki sayinin birinin digerinden buyuk ve esit oldugunu sorgular
        // <=  iki sayini birinin digerinden kucuk ve esit oldugunu sorgular


        // TUM bu relational operatorlerin cevabu boolean olarak doner.
        // Ayni zamanda buyuk tur ve kucuk tur disinda tum soru sartlari esittir operatörün önünde yazilir.


        // vatiable Definition initianlization (degiskeni tanimlama ve iniltilendirme)

        int rakam=3;
        int sayi=4;
        System.out.println("rakam ve sayi birbirine esit mi="+(rakam==sayi)); //boolean false


        System.out.println("sayi rakamdan kucuk mu="+(sayi<rakam)); //

        System.out.println("rakam sayidan buyuk ve esit midir="+(rakam>= sayi));
        System.out.println("rakam ve sayi esit degil mi="+(rakam!=sayi));
        System.out.println("rakam sayidan kucuk ve esit mi="+(rakam<=sayi));
        System.out.println("sayi rakamdan buyuk mu="+(sayi>rakam));














    }
}
