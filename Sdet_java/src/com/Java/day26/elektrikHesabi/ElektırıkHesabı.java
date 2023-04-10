package com.Java.day26.elektrikHesabi;

public class ElektırıkHesabı {
    double toplamTuketım;
    double oran;
    double odenecekTutar;
    String elektrikHesabi;

    public void tuketimYazdir() {
        odenecekTutar = toplamTuketım * oran;
        System.out.println("odenecekTutar = " + odenecekTutar);
    }
}





