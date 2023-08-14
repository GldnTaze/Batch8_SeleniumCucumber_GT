package com.Java.day23;

public class _1_parametrelisoru {
    public static void main(String[] args) {



        //Bir boolean methot yazın,en az iki tane int parametre alsın.
        // Bu parametre değişken değerlerinin ilk  rakami (yani 3465/10 =>346.5 sayısında ilk değer 3)
        // aynı ise TRUE değilse FALSE döndürsün. Sonrasında main de bu TRUE dönmesi durumunda degerleri toplasın.
        // Değil ise bölme işlemi yapsın

        int sayi1=2435;
        int sayi2=2633;

        if (sayiHesaplama(sayi1,sayi2)){
            System.out.println(sayi1+sayi2);
        }else {
            System.out.println(sayi1/sayi2);
        }

    }

    public static boolean sayiHesaplama(int sayi1 , int sayi2){
        int sayiHesaplama1=0;
        int sayiHesaplama2=0;


       while (sayi1>=10){

           sayi1=sayi1/10;
           sayiHesaplama1=sayi1;
       }
        while (sayi2 >= 10) {

            sayi2=sayi2/10;
            sayiHesaplama2=sayi2;
        }
        if (sayiHesaplama1==sayiHesaplama2){
           return true;
        }else {
            return false;
        }

    }
}
