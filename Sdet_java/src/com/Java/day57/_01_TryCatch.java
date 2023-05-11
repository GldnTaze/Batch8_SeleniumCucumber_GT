package com.Java.day57;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {
        for (int i = 0; 0 < 5; i++) {

            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("1.sayiyi giriniz:");
                int sayi1= sc.nextInt();

                System.out.println("2. sayiyi giriniz:");
                int sayi2=sc.nextInt();

                int bolum=sayi1/sayi2;
                System.out.println("kullanicidan alinan iki sayinin bolum degeri="+bolum);
            } catch (ArithmeticException ex){
                System.out.println("2. sayiyi sifir olarak girmeyiniz");
                i--;

            }catch (InputMismatchException ex){
                System.out.println("lutfen sayi giriniz");
            }

        }

    }
}
