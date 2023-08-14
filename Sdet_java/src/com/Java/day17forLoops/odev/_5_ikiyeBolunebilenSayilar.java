package com.Java.day17forLoops.odev;

public class _5_ikiyeBolunebilenSayilar {
    public static void main(String[] args) {



         int ikiIleBolunen= 0;

        for (int i=1; i<=100; i++){
            if (i%2 == 0){

                ikiIleBolunen ++;

            }
        }System.out.println("ikiye bolunen sayi adeti=" +ikiIleBolunen);

        for (int i =1; i<=100; i++){
            if (i%2==0){
                System.out.println("bu sayi ikiye bolune bilir=" +i);
            }
        }



    }
}
