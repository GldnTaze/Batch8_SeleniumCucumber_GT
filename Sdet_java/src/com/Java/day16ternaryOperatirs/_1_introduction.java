package com.Java.day16ternaryOperatirs;

public class _1_introduction {
    public static void main(String[] args) {

        int sayi=1286;
        int onlarBasamagi= (sayi/10)%10;

        switch (onlarBasamagi){

            case 0: System.out.println("onlarBasamagi: 0´dir.");break;
            case 1: System.out.println("onlarBasamagi: 1´dir.");break;
            case 2: System.out.println("onlarBasamagi: 2´dir.");break;
            case 3: System.out.println("onlarBasamagi: 3´dir.");break;
            case 4: System.out.println("onlarBasamagi: 4´dir.");break;
            case 5: System.out.println("onlarBasamagi: 5´dir.");break;
            case 6: System.out.println("onlarBasamagi: 6´dir.");break;
            case 7: System.out.println("onlarBasamagi: 7´dir.");break;
            case 8: System.out.println("onlarBasamagi: 8´dir.");break;
            case 9: System.out.println("onlarBasamagi: 9´dir.");break;
            default:
                  System.out.println("Tanumlanmayan deger");break;

        }

        //TODO:verilen bir sayinin ay numarasina göre kac gun ve hangi ay oldugunu yazdiriniz
    }
}
