package com.Java.day30dateAndTime;

public class _6_charAt2 {
    public static void main(String[] args) {

        String str ="apple";
        char ilkHarf=str.charAt(0);
        if (ilkHarf=='a'){
            System.out.println("a ilk karakterdir");
        }else {
            System.out.println("a ilk karakter degildir");
        }
        String mycar="civic";
        if (mycar.charAt(0)==mycar.charAt(4)){
            System.out.println("ilk ve son karakterler aynidir");
        }else {
            System.out.println(" ayni degildir");
        }

        String word1="java Script";
        //ilk ve son karakter ayni mi
        char ilkKarakter=word1.charAt(0);
        char sonKarakter=word1.charAt(word1.length()-1);
        if (ilkKarakter==sonKarakter){
            System.out.println("karakterler esit");
        }else {
            System.out.println("esit degil");
        }
        System.out.println("*****************");

        //word1 in uzunlugu
        System.out.println("word1 in uzunlugu:"+word1.length());
        System.out.println("index:"+(word1.length()-1));
    }
}
