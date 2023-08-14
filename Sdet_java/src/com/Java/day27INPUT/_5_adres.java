package com.Java.day27INPUT;

import java.util.Scanner;

public class _5_adres {
    public static void main(String[] args) {
        //kullanicidan cadde sokak postakodi(int) ve ulke bilgileri isteyip yazdiriniz

        Scanner anket = new Scanner(System.in);
        System.out.println("lutfen cadde bilgisini giriniz:");
        String cadde = anket.nextLine();
        System.out.println("lutfen sokak bilgisini giriniz:");
        String sokak = anket.nextLine();
        System.out.println("lutfen postaKodu bilgisini giriniz:");
        int postaKodu = anket.nextInt();
        anket.nextLine();
        System.out.println("lutfen ulke bilgisini giriniz");
        String ulke=anket.nextLine();

        System.out.println("adres bilgisi:"+cadde+","+sokak+","+postaKodu+","+ulke);

    }
}
