package com.Java.day30dateAndTime;

public class _7_ornek {
    public static void main(String[] args) {
        /*
        bir program yaziniz: verilen String icerisinde tekrar eden karakterleri
        tekrar sayisi ile birlikte yaziniz
        String word="abcdbbasacssr";

         */
        String word="abcdbbasacssr";
        char aChar='a';
        int counter=0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)==aChar){
                counter++;
            }

        }
        System.out.println(aChar+" karakteri "+word+" icerisinde "+counter+" kez tekrar edilmistir");

    }
}
