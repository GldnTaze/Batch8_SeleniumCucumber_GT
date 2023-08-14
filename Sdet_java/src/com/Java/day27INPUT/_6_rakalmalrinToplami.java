package com.Java.day27INPUT;

import java.util.Scanner;

public class _6_rakalmalrinToplami {
    public static void main(String[] args) {
        //kullanici tarafindan girilen bir sayinin rakamalarinin toplamini vern programi yaziniz
        //ornek klavyeden girilen 1234 --> 1+2+34=10
        // method kullanininz


        int sonuc=rakamlarinToplami();
        System.out.println("girilen sayinin rakamalarinin toplami="+sonuc);
    }
    public static int rakamlarinToplami(){
        int Sayi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        Sayi=scanner.nextInt();
        int rakam=0;
        int rakamToplami=0;
        while (Sayi!=0){
            rakam=Sayi%10;
            rakamToplami+=rakam;
            Sayi/=10;
        }
        return rakamToplami;

    }
}
