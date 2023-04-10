package com.Java.day28;

public class _3_stringPool2 {
    public static void main(String[] args) {
        String s1="mustafa bey";
        String s2="mustafa bey";
        String s3="mustafa bey";

        String yenis=new String("mustafa bey");

        if (s2==yenis){
            System.out.println("burada kaplar kiyas edilir");
        }else {
            System.out.println("kaplar esit degil");
        }
        ///////////////////////////////////////
        if (s2.equals(yenis)){
            System.out.println("burada kap icerisinde ki degerler kiyaslanir");
        }else {
            System.out.println("degerler esit degil");
        }

    }
}
