package com.Java.day16ternaryOperatirs;

public class _2_ternaryOperators {
    public static void main(String[] args) {

        int x,y;

        x=20;

        y=(x%2==0) ?61:95;  //x cift ise y=61 degilse y=95
        System.out.println("y = " + y);

        //IF
        if (x%2==0){
            y=62;
            System.out.println("y="+y);
        }else {
            y=95;
            System.out.println("y="+y);
        }
    }
}
