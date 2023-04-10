package com.Java.day16ternaryOperatirs;

public class _3_ {
    public static void main(String[] args) {

        int num=17;
        String result;

        //klasik  yontem
        if (num>0){
            result="sayi pozitiftir";
            System.out.println("result");
        }else {
            result="sayi negatiftir";
            System.out.println("result");
        }

        //ternary operator
         result=(num>0) ? "sayi pozitiftir" : "sayi negatiftir";
        System.out.println("result = " + result);

        //en pratik hali
        System.out.println(result= (num>0) ? "sayi pozitiftir" : "sayi negatiftir");

        // ?--> if olarak tanimlanir     : -->else yerine geciyor


    }
}
