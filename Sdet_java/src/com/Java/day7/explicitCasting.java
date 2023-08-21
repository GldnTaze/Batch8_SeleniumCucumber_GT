package com.Java.day7;

public class explicitCasting {
    public static void main(String[] args) {

        double double1n=10.99;
        int int1= (int)double1n;
        double double2= int1;

        System.out.println("double="+double2);
        System.out.println("integer="+int1);

        short short2= 130;
        byte byte1= (byte)  short2;
        System.out.println("byte="+byte1);
        System.out.println("%="+130%127);


    }
}
