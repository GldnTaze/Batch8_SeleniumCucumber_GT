package com.Java.day26.elektrikHesabi;

public class musteri {
    String name;
    double elektrikKullanimi;

    public double tuketimEkle(double aylikTuketim){
        return aylikTuketim+=aylikTuketim;
    }
}
