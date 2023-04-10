package com.Java.day30dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class _1_ {
    public static void main(String[] args) {
       //Date ve time -->zaman tanimlama icin kullanilan Date ve Localdate kullanimi
        Date date=new Date();
        System.out.println(date);
        //ayni scanner da kullanilan system.in gibi sizin bilgisayarinizdaki bilgileri okur
    LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear():"+tarih.getYear());
        System.out.println("tarih.getDayOfMonth():"+tarih.getDayOfMonth());
        System.out.println("tarih.getMonth():"+tarih.getMonth());
        System.out.println("tarih.getDayOfWeek():"+tarih.getDayOfWeek());
        //hazir metod
       tarih.format(DateTimeFormatter.ISO_DATE);
       System.out.println(tarih);


       DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyy");
        System.out.println("ozelFormat:"+tarih.format(ozelFormat));

    }
}
