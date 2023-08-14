package com.Java.day33ArrazsMehod;

public class _1_ {
    public static void main(String[] args) {
        //bir Arry method yazilarak nasil calisir

        int[] plakalar={1,4,34,56,47,6,35};
        int[]sayilar ={12,44,32,10,56,24,76,13};
        ilkVeSonElementKnt(plakalar);
        ilkVeSonElementKnt(sayilar);

        String[]klupler={"galatasaray" ,"besitkas","fenerbahce","trabzonspor","adanademir"};
        ilkElementKnt(klupler,new String[]{"barcelona","brezilya","milan"});

        //System.out.println("array:");
        for (int i:reserArray(sayilar)) {
            System.out.println("i = " + i);
        }

    }
    public static void ilkVeSonElementKnt(int[] abc){
        if (abc[0]==abc[abc.length-1]){
            System.out.println("ilk ve son elementleri esit");
        }else {
            System.out.println("esit degil");
        }
    }

    public static void ilkElementKnt(String[]str1, String[]str2){
        if (str1[0].equalsIgnoreCase(str2[0])){
            System.out.println("dizilerin ilk elementleri bir birine esit");
        }else {
            System.out.println("bir birinr esit degil");
        }
    }
    public static int[] reserArray(int[]arr){  //reser ters dondurme
        int[] newArray=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArray[i]= arr[arr.length-1-i];

        }
     return newArray ;
    }
}
