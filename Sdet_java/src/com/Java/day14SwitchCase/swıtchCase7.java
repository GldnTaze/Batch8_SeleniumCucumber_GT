package com.Java.day14SwitchCase;

public class swıtchCase7 {
    public static void main(String[] args) {
        // iki basamakli bir sayiyi ekrana yazi ile yazdiriniz

        int sayi=19;
        int birlerBasamagi= sayi%10;
        int onlarBasamagi=sayi/10;
        if (sayi>=10 && sayi<=99) {
            switch (onlarBasamagi) {
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("Yirmi ");
                    break;
                case 3:
                    System.out.print("Otuz ");
                    break;
                case 4:
                    System.out.print("Kirk ");
                    break;
                case 5:
                    System.out.print("Elli ");
                    break;
                case 6:
                    System.out.print("Altmis ");
                    break;
                case 7:
                    System.out.print("Yetmis ");
                    break;
                case 8:
                    System.out.print("Seksen ");
                    break;
                case 9:
                    System.out.print("Doksan ");
                    break;
            }

            switch (birlerBasamagi) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;

            }
        } else System.out.println("bu sayi iki basamakli degildir");


    }
}
