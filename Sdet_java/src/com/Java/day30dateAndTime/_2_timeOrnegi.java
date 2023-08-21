package com.Java.day30dateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _2_timeOrnegi {
    public static void main(String[] args) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date tarih = new Date();
        System.out.println(sdf.format(tarih));


        LocalDateTime tarih1 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //gun/ay/yil saat/dakika/saniye seklinde yazilmasi icin harflerin buyuk veya kucuk olmasi ONEMLI
        System.out.println(dtf.format(tarih1));



    }
}
