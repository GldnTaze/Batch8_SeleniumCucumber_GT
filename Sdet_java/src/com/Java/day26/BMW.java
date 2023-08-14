package com.Java.day26;

public class BMW{
    String marka ="BMW";
    String model;
    double price;
    boolean aracElektriklimi;

    public void showPrice(){

        switch (model){
            case"330i":price=55000;break;
            case"x1":price=43000;break;
            case"x2":price=48000;break;
            case"x3":price=51000;break;
            case"x5":price=53000;break;
            default:
                System.out.println(model+"is not available");
                price=0.00;
        }
        System.out.println("this model`s price is"+price );
    }


}
