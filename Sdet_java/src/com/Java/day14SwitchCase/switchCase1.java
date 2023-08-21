package com.Java.day14SwitchCase;

public class switchCase1 {
    public static void main(String[] args) {

        String sehir="Adiyaman";
        switch (sehir){
            case "Ankara":
                System.out.println("bu sehirde deprem olmamistir");break;
            case "Adiyaman":
                System.out.println("bu sehirde deprem olmustur");
                System.out.println("bu sehirde 4000 kisi vefaz etti");break;
            case "Hatay":
                System.out.println("bu sehirde deprem yasanmistir");break;

            default:
                System.out.println("bu sehirde deprem riski yoktur");

        }
    }
}
