package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        //bir ogretmenden istedigi kadar not aliniz ve alinan notlarin ortalamasini gecen ogrenci sayisini bulalim

        ArrayList<Integer> notlar=new ArrayList<>();
        Scanner scNot=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        String devaMi;
        int sum=0;
        do{
            System.out.println("lutfen not giriniz:");
            int orgNot=scNot.nextInt();
            notlar.add(orgNot);
           sum+=orgNot;
            System.out.println("devam mi: E/H");
          devaMi= scanner.nextLine();
        }while (devaMi.equalsIgnoreCase("E"));

        double ortalama=sum/ notlar.size();//eleman sayisi ile not ortalamasini bulduk
        int counter=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if (notlar.get(i)>ortalama){
                counter++;
            }

        }
        System.out.println("girilen org notlari:"+notlar);
        System.out.println("ortalama:"+ortalama);
        System.out.println(notlar.size()+"ortalamayi gecen org sayisi:"+counter);

    }
}
