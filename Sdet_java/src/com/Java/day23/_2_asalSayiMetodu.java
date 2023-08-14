package com.Java.day23;

public class _2_asalSayiMetodu {
    public static void main(String[] args) {
       //bir boolean metodu yazin icinde tek bir parametre olsun ve bunun asal olup olmadigini kalsin
       //main icine asal sayidir veya asal sayi degildir
        if (asalSayi(35)){
            System.out.println("sayi asal sayidir");
        }else {
            System.out.println("asal sayi degildir");
        }
    }
    public static boolean asalSayi( int sayi){
        boolean flag =true;
        if (sayi==0 || sayi==1 ){
            flag=false;

        }
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }


}
