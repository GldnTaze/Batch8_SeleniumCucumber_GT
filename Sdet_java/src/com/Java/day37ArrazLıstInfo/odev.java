package com.Java.day37ArrazLıstInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
//        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
//        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
//        -Yukarıda verilen stringlerin alfabede yer alan karakteri bir string e atayan method yazınız.
//        -Ardından bu yenı oluşturulan string deki rakamları bir ArrayList e atayıp yazdırınız.
//                -Farklı algoritma ve methodlar denenebilir.

        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";



       // Bir ArrayList oluşturun, haftanın günlerinin isimlerini atayınız. Ardından haftasonu günlerinin tek tek listeden siliniz.

        ArrayList<String> haftaninGunleri=new ArrayList<>();

        haftaninGunleri.add("pazartesi");
        haftaninGunleri.add("Sali");
        haftaninGunleri.add("Carsamba");
        haftaninGunleri.add("Persembe");
        haftaninGunleri.add("Cuma");
        haftaninGunleri.add("Cumartesi");
        haftaninGunleri.add("pazar");
        System.out.println(haftaninGunleri.toString());

        haftaninGunleri.remove("Cumartesi");
        System.out.println(haftaninGunleri);

        haftaninGunleri.remove(5);
        System.out.println(haftaninGunleri);


        //Kullanıcıdan alarak 12 ayın ismini ekleyiniz. Kullanıcının 9 uncu ve 11 inci elemanı yanlış yazdığı için
        // sizler kendiniz bu indexteki değerlerini yeniden atayınız.

        ArrayList<String>aylar=new ArrayList<>();
        Scanner ayIsmi=new Scanner(System.in);
        for (int i = 1; i <12 ; i++) {
            System.out.println("lutfen "+ i+".ayi girin:");
            aylar.add(ayIsmi.nextLine());

        }

        aylar.set(8,"Eylul");
        aylar.set(10,"Kasim");
        System.out.println(aylar);

        System.out.println("**************************");




    }


}

