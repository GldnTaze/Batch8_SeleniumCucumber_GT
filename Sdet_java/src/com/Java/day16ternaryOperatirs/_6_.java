package com.Java.day16ternaryOperatirs;

public class _6_ {
    public static void main(String[] args) {


    int n1=12, n2=9, n3=-14;

    //buradaki sayilarin en buyugunu ternary ile bulunuz

        int enBuyuk= (n2>n1) ? (n2>n3) ? n2 : n3:( (n1>n3) ? n1:(n3>n2) ? n3:n2);
    }
}
