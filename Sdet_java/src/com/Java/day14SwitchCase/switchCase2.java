package com.Java.day14SwitchCase;

public class switchCase2 {
    public static void main(String[] args) {
        int sayi=11;
        int kalan=sayi%2;

        switch (kalan){
            case 0:
                System.out.println("bu sayi ciftir");break;
            case 1:
                System.out.println("bu sayi tektir");
        }

    }
}
