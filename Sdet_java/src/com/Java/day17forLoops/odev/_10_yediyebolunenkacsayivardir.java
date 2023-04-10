package com.Java.day17forLoops.odev;

public class _10_yediyebolunenkacsayivardir {
    public static void main(String[] args) {
        int yedilebolunen =0;

         for (int i = 0; i <=3000 ; i++) {
            if(i % 7==0){
                yedilebolunen ++;
            }

        }
        System.out.println("yedi ile bolunen sayi adedi:"+ yedilebolunen);
    }
}
