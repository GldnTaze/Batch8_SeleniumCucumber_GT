package com.Java.day14SwitchCase;

public class switchCase3 {
    public static void main(String[] args) {
        int ay=1;
        String ayismi;
        String mevsimler;

        switch (ay){
            case 1:ayismi="ocak";break;
            case 2:ayismi="subat";break;
            case 3:ayismi="mart";break;
            case 4:ayismi="nisan";break;
            case 5:ayismi="mayis";break;
            case 6:ayismi="haziran";break;
            case 7:ayismi="temmuz";break;
            case 8:ayismi="augtos";break;
            case 9:ayismi="eylul";break;
            case 10:ayismi="ekim";break;
            case 11:ayismi="kasim";break;
            case 12:ayismi="aralik";break;
            default:ayismi=" uygun olmayan ay`dir";

        }
        switch (ay){
            case 12:
            case 1:
            case 2:
              mevsimler="kis";break;
            case 3:
            case 4:
            case 5:
                mevsimler="ilkbahar";break;
            case 6:
            case 7:
            case 8:
                mevsimler="yaz";break;
            case 9:
            case 10:
            case 11:
                mevsimler="sonbahar";break;
            default: mevsimler="uygun bir mevsim degildir";
        }
        if (ay>=0 && ay <=12) {
            System.out.println(ayismi + " ay " + mevsimler + " mevsimindedir ");
        }else{
            System.out.println("bu sayida bir ay mevcut degildir");
        }

    }
}
