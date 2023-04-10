package com.Java.day17forLoops;

public class _2_katSoruları {
    public static void main(String[] args) {

        for (int num=10; num>0; num--){  //10 dan baslayip 0 kadar azalarak gitmesi

            System.out.println("num="+num);

        }
        // 10 ar 10 ar artarak 0 dan 100kadar
//
//        for (int i=0;  i<=100; i+=10){
//            System.out.println("i="+i);
//        }

        //0 ile 50 arasindaki 4 dun katlarini yazdiriniz

        for (int i=0; i<=50; i+=4){
            System.out.println("i="+i);
        }
        System.out.println("***************");
        for (int i=50; i>=0; i-=4){  //4 azalarak 4 kati degil mantik hatasi
            System.out.println("i="+i);
        }

    }
}
