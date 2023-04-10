package com.Java.day32ARRAYSseri;

import java.util.Scanner;

public class _4_ornek {
    public static void main(String[] args) {
        String[] days=new String[7];
        days[0]="pazartesi";
        days[1]="sali";
        days[2]="carsamba";
        days[3]="persembe";
        days[4]="cuma";
        days[5]="cumartesi";
        days[6]="pazar";

        Scanner sc=new Scanner(System.in);
        System.out.println("bugunun indexsini yazar misiniz");
        int gunindex=sc.nextInt();
        System.out.println("giridginiz index ile tanimlanan gun:"+days[gunindex]);
    }
}
