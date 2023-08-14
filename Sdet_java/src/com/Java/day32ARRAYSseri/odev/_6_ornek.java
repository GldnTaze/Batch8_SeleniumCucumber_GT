package com.Java.day32ARRAYSseri.odev;

public class _6_ornek {
    public static void main(String[] args) {

        String ezCumle="kararmis ruhlar rencide edici bakislari arasinda hergun affederek yuruyorum;yazar:Ismet Gunes";

        // bu cumlede gecen kelimeri bir array olusturulup element olarak atayiniz
        // yazarin ismini kisaltarak yaziniz


       String[] kelimeler= ezCumle.split( " ");
        System.out.println(kelimeler.length);

        for (String str:kelimeler) {
            System.out.println(str);
        }
        char yazarinAdi=kelimeler[kelimeler.length-2].charAt(0);
        char yazarinSoyadi=kelimeler[kelimeler.length-1].charAt(0);
        System.out.println(yazarinAdi+ " ." + yazarinSoyadi + ".");

        //ikinci cozum yolu
        int counter=0;
        for (int i = 0; i < ezCumle.length() ; i++) {
            if (ezCumle.charAt(i)== ' '){
                counter++;
            }
        }
        int element=0;
        String[] kelimeler1=new String[counter+1];
        for (int i = 0; i < ezCumle.length(); i++) {
            if (ezCumle.charAt(i)== ' '){
                element++;
                continue;
            }
            kelimeler1[element]+=ezCumle.charAt(i);

        }
        for (String s:kelimeler1) {
            System.out.println("s = " + s.substring(4));
        }
        for (int i = 0; i <kelimeler1.length ; i++) {
            System.out.println(i+"elemente ait kelime:"+kelimeler1[i].substring(4));
            if (i==kelimeler1.length-2 || i==kelimeler1.length-1){

            }

        }
    }
}
