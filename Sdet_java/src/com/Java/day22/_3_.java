package com.Java.day22;

public class _3_ {
    public static void main(String[] args) {
        int yas;
        specialEleven(22);

    }
    public static void specialEleven(int number){
        if(number%11==0 || (number-1)%11==0|| number%11==1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
