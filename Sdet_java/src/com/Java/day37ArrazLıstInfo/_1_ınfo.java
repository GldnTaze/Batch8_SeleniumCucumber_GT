package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;

public class _1_ınfo {
    public static void main(String[] args) {
        //Arrays -->tum dizilerin icindeki fonksiyonlari barindirir
        //ArrayList ise collection altinda yer almaktadir
         int[] sayilar ={1,3,5,6}; //sabit bir diizi olusturduk

        ArrayList<String>isimler=new ArrayList<String>();//burada bir tanimladik

        //ArrayList sadece WRAPPER clas ile calisir
        ArrayList<Boolean>dogruyanlis=new ArrayList<>();
        ArrayList<Integer>saList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();
        System.out.println("atamadan:"+isimler);
        //Eleman ekleme
        isimler.add("Bilal");
        isimler.add("Gulden");
        isimler.add("Tazeoglu");
        isimler.add("Ramazan");
        isimler.add("Selim");
        System.out.println("atadik:"+isimler);
        System.out.println(isimler.toString());

        //eleman sayisini bulma
       int elemanSayisi= isimler.size();
        System.out.println("eleman sazısı:"+elemanSayisi);

        //index bulma
       String elementDegeri= isimler.get(2);  //indexteki elemani verir
        System.out.println(elementDegeri);


        //index e eleman atama
        isimler.set(2,"GuldenT"); //yazilimi dgisitridik
        //isimler.set(6,"ismet")  olmayan bir eleman creat ettik
        System.out.println(isimler);

        //bir elemanin indexini bulma
        int indexDeger=isimler.indexOf("Selim");

        //eleman bu sekilde var mi yok mu
        boolean elemenCheck=isimler.contains("Ismail"); //dizide eleman olup olmadigini

        //bos mu dolumu
        boolean emtyMi=isimler.isEmpty();
        System.out.println(emtyMi);



        //Eleman silme  1--> indexe gore , 2-->eleman degeri gore
        System.out.println("isimler = " + isimler); //silme oncesi
        System.out.println("isimler.remove(\"Selim\") = " + isimler.remove("Selim"));//2 e gore eleman silme
        System.out.println("ilk remove sonrasi isimler = " + isimler);
        System.out.println("isimler.remove(2) = " + isimler.remove(2));//1 e gore
        System.out.println("ikinci remive sonrasi isimler = " + isimler);
    }
}
