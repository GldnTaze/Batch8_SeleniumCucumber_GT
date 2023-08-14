package com.Java.day14SwitchCase;

public class swıtchCase6 {
    public static void main(String[] args) {

        //Artik yil hesaplayan ve ekrana yazan bir program
        int yil=2024;
        int kalan=yil%4;

        switch (kalan){
            case 0:
                System.out.println("bu yil artik bir yildir subat ayi 29 ceker");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("bu yil artik bir yil degildir, subat ayi 28 gun ceker");
        }

    }


}
