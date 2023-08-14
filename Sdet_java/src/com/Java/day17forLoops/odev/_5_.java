package com.Java.day17forLoops.odev;

public class _5_ {
    public static void main(String[] args) {
         int tektop=0;
         int cifttop=0;

        for (int i=1 ; i<= 100 ; i++ ){
            if (i%2==0){
                cifttop=cifttop+1;
                //System.out.println(i+" sayisi ciftir");

            }else {
                tektop= tektop+1;
                //System.out.println(i+"tek bir sayidir");
            }
        }
        System.out.println("tektop="+tektop);
    }
}
