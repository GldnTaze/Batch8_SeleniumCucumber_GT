package com.Java.day20;

public class _3_lebalebBranching {
    public static void main(String[] args) {
        // ic ice dongulerde BREAK ve CONTINUE calisma bicimleri

        int i=0;

     outer:   do {
            i=8;

          inner:  while ( true){
                System.out.println(" i--="+i--);
                if (i==4){
                    int toplam=i+5;
                    System.out.println("toplam="+toplam);
                    break outer;
                }
            }

        }while (true);

        //ic ice dongulerde continue ve break hangi dongu gecerli oldugunu

    }
}
