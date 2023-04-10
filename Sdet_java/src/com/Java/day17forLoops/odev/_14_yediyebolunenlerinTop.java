package com.Java.day17forLoops.odev;

public class _14_yediyebolunenlerinTop {
    public static void main(String[] args) {

        int sayilarinTop=0;

        for(int i=0; i<=200; i++){
            if (i%7==0){
              sayilarinTop+=i;

            }
        }
        System.out.println("sayilarinTop="+ sayilarinTop);
    }

}
