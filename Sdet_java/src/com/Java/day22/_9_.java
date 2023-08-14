package com.Java.day22;

public class _9_ {
    public static void main(String[] args) {
        System.out.println(enBuyukSayi(45,85));
    }

    public static int enBuyukSayi(int sayi1, int sayi2) {
        int enb;
        if (sayi1 > sayi2) {
            enb=sayi1;

        }else {
            if (sayi1==sayi2){
                enb=0;
            }else {
                enb=sayi2;
            }
        }
        return  enb;
    }

}
