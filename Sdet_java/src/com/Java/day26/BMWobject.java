package com.Java.day26;

public class BMWobject {
    public static void main(String[] args) {

        BMW b1=new BMW();
        System.out.println(b1.marka);
        System.out.println(b1.price);

        BMW b3=new BMW();
        System.out.println("suhedanin arabasnin markasi:"+b3.marka);
        System.out.println("suhedanin arabasnin modeli:"+b3.model);
        b3.showPrice();
        b3.showPrice();
        b3.aracElektriklimi=true;
        System.out.println("suhedanin arabasi elektrikli mi:"+b3.aracElektriklimi);

    }
}
