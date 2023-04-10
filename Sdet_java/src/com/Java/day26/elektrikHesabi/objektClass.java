package com.Java.day26.elektrikHesabi;

public class objektClass {
    public static void main(String[] args) {

        ElektırıkHesabı elektrikHesabi=new ElektırıkHesabı();
        musteri musteri=new musteri();
        ElektırıkHesabı elektrikHesabi1=new ElektırıkHesabı();
        musteri musteri1=new musteri();

        elektrikHesabi.oran=0.7;
        elektrikHesabi1.oran=0.67;

        int yeniOran=(int) (elektrikHesabi.oran+elektrikHesabi1.oran);

        musteri.name="Mr.Selim";
        musteri1.name="Mr.Bilal";
    }
}
