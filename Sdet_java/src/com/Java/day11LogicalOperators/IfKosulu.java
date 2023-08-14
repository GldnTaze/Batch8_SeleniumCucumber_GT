package com.Java.day11LogicalOperators;

public class IfKosulu {

    public static void main(String[] args) {

        //Algoritma SART , KOSUL belirlemeler vardi

      boolean answer= true;
        System.out.println(answer);

        // EGER kosolunu ifade eden JAVA syntex if kosuludur.

       // kosullu ifadekerde kosulu direk olarak test eden bir tanimlamadir


        //  System.out.println(  (if (sayi1/sayi2==1)); bu sekilde yazamam
        int sayi1 =13;
        int sayi2=13;

        if (sayi1/sayi2==1); //  eger sayi1 sayi2 ye bolumu esit ise bu isle mi yap


        sayi2*=sayi1; //esit ise
        System.out.println(sayi2);

        //OZELLIKLER

        //KALAN DAKIKALARIN SANIYE CINSINDEN dogru sinuc verdigini test edein

        int dakika=11;
        int saniye=60;
        int toplamSaniye=dakika*saniye;
        if(toplamSaniye==665){        // eger toplam saniye 660 a esit ise IF ile cercevelen kodlari calistiri

            System.out.println("toplamSaniye="+toplamSaniye);

        }
        // suslu parantez icinde ki kosulun testin tum olasiklari denemek zorunda kalin miyor




        //soru: 2 tane int degeri tanimal x ve y, xve y ye deger at/ al
        // eger y >0 ise x degerini degidtir ve 1 ata x ve y nin degerini yazdirin


        int x=-20;  //bak
        int y=12;

        if(y>0) {
            x=1;
        }

        System.out.println("x="+x);
        System.out.println("y="+y);

        //operatorlerde x=x+1ile x+=1 esittir

        //eger ile ifade edilen kosulun en sade seklinde yazilmasi ve islem onceliklerini parantese alinmasi

        // logic operatorlerini en cok kullanildigi alandir

        int num1=36;
        int num2=3;


        if(num2/num1==4 || num2*num1>100 && num2%4==0){
            num2+=55;
            num1-=25;
            num2++;
            System.out.println("nummer1="+ --num1);
            System.out.println("nummer2="+ ++num2);

        }
        System.out.println(num2/num1==5);



    }
}
