package com.Java.day14SwitchCase;

public class switchCase4 {
    public static void main(String[] args) {

        // bugun gunlerden persembedir 100 gun sonra hangi gundur

        int hesGunSayisi=100;
        int kalanGunSayisi=hesGunSayisi%7;
        String yeniGun="";

        switch (kalanGunSayisi){
            case 1: yeniGun ="cuma"; break;
            case 2: yeniGun ="cumartesi"; break;
            case 3: yeniGun ="pazar"; break;
            case 4: yeniGun ="pazartesi"; break;
            case 5: yeniGun ="sali"; break;
            case 6: yeniGun ="carsamba"; break;
            case 0: yeniGun ="persembe"; break;
        }
        System.out.println(hesGunSayisi + " gun sonra,gunlerden " + yeniGun +"\' dir");

    }
}
