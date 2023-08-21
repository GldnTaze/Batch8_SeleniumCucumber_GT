package com.Java.day7;

public class Casting2 {
    public static void main(String[] args) {
        int int1 =100;
        double double1=123;
        int int2 =(int) (int1+double1);

        double double2= int2;
        System.out.println(double1+int1);
        System.out.println(int2);

        float float1= 238746.234f;
        int int3 = 283743;

        short float2 =(short) (float1 *int3);


    }
}
