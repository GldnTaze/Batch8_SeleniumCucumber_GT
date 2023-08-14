package com.Java.day32ARRAYSseri;

public class _8_forEach {
    public static void main(String[] args) {
        String [] names = {"names1", "name2", "name3", "name4", "name5", "name6"};

        double[] prices=new double[4];
        prices[0]=105;
        prices[1]=10.5;
        prices[2]=125.55;
        prices[3]=15.99;

        //Normal bildigimiz for ile
        for (int i = 0; i < names.length; i++) {
            System.out.println("names = " + names[i]);
        }
        //Foreach ile yazdirilma islemi. Genellikle yazdirma isleminde pratik bir yontem sunar
        for (String s:names) {
            System.out.println("s = " + s);
        }


        //Verilen fiyatlara %20 iskonto uygulayiniz

        for (double db:prices) {
            System.out.println("db*0.20 = " + (db-db*0.20));
        }
    }
}
