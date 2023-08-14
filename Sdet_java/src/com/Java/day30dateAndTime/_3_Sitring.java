package com.Java.day30dateAndTime;

public class _3_Sitring {
    public static void main(String[] args) {
        //bu sekilde obje veya nesne kreat edile bilir
        String name="Gulden";
        //yeni nesne olusturmak icin

        String lastName=new String("tazeoglu");
       //new kelimesi kullanilip bir String nesnesi olusturulup önceden bir deger alsa dahi
        //farkli bir nesne ile tanimlanir

        String s1="bilal";
        String s2="bilal";
        String s3="ismail";
        String s4=new String("ismail");
        String s5=new String("bilal");
        if (s1==s2){
            System.out.println("bilal olarak yazdigimiz objeler String class icerisiinde ayni objeye esit");
            System.out.println("yani s1 s2 degerinezit oldugu icin sadece s1 objesine esitlendi");
        }else {
            System.out.println("s1 ile s2 degerleri farkli");
        }
        if (s1==s5){
            System.out.println("objeler esit, yani ayni degeri ifade eden objeyi tanimliyor");
        }else {
            System.out.println("degerleri ayni olsa ds farkli objeleri temsil ediyor");
        }
        if (s3.equals(s4)){
            System.out.println("objelerin degerlerine esit oldugunu bizegösteriyor");
            System.out.println("burada objelerin degerleri kiyaslandi, equals ile yaptik");
        }
    }
}
