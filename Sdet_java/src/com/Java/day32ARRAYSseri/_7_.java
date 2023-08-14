package com.Java.day32ARRAYSseri;

public class _7_ {
    public static void main(String[] args) {
        String []futbolcular=new String[11];
        //takim 11 kisiden olusuyor
        futbolcular[0]="pele ";
        futbolcular[1]="messi ";
        futbolcular[2]="ronaldo ";
        futbolcular[3]="hami ";
        futbolcular[4]="ali ";
        futbolcular[5]="samiyen ";
        futbolcular[6]="hasan ";
        futbolcular[7]="hakan ";
        futbolcular[8]="emre ";
        futbolcular[9]="alex ";
        futbolcular[10]="lefter ";

        System.out.println("futbolcularin isimlerinin ilk harfi");
        for (int i = 0; i <futbolcular.length ; i++) {
            char ilkharf=futbolcular[i].charAt(0);
            System.out.print(ilkharf+". ");

        }
    }
}
